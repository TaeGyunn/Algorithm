package baekjoon;

import java.util.*;

public class 파티_1238 {

    static int INF = 987654321;
    static int N, M, X;
    static int[] dist, revDist;
    static ArrayList<List<Node>> list, revList;

    static class Node implements Comparable<Node>{
        int idx; // 도착지점
        int cost; // 소요

        public Node(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node n) {
            return this.cost - n.cost;
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt(); // 학생 수
        M = scan.nextInt(); // 간선
        X = scan.nextInt(); // 도착지점
        list = new ArrayList<List<Node>>(); // 리스트
        revList = new ArrayList<List<Node>>();  // 돌아올리스트
        dist = new int[N+1];    // 거리 저장 배열
        revDist = new int[N+1]; // 돌아올 거리 저장 배열

        Arrays.fill(dist, INF);
        Arrays.fill(revDist, INF);

        for(int i=0; i <= N; i++){
            list.add(new ArrayList<Node>());
            revList.add(new ArrayList<Node>());
        }

        for(int i=1; i<=M; i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int time = scan.nextInt();

            list.get(start).add(new Node(end, time));
            revList.get(end).add(new Node(start, time));
        }

        dijkstra(list, dist, X);
        dijkstra(revList, revDist, X);

        int max = Integer.MIN_VALUE;
        for(int i=1; i<=N; i++){
            max = Math.max(max, dist[i] + revDist[i]);
        }
        System.out.println(max);

    }
    static void dijkstra(ArrayList<List<Node>> list, int[] distance, int start){
        boolean[] visited = new boolean[N+1];
        PriorityQueue<Node> pq = new PriorityQueue<Node>();

        distance[start] = 0;
        pq.add(new Node(start, 0));

        while(!pq.isEmpty()) {
            int idx = pq.poll().idx;

            // 방문한 곳은 또 방문할 필요 없음
            if(visited[idx]) continue;
            visited[idx] = true;

            for(Node node : list.get(idx)) {
                // node.index 까지의 거리는 (시작점->idx 거리 + idx->node.index 거리) 중 더 작은 것
                if(distance[node.idx] > distance[idx] + node.cost) {
                    distance[node.idx] = distance[idx] + node.cost;
                    pq.add(new Node(node.idx, distance[node.idx]));
                }
            }
        }
    }
}
