package baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DFS와BFS_1260 {

    public int N;

    public void solve(){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt() + 1;               // 정점의 개수
        int M = sc.nextInt();               // 간선의 개수
        int start = sc.nextInt();           // 시작지점
        int[][] map = new int[N][N];
        int[][] visited = new int[N][N];
        
        // map 선언
        for(int i=0; i<M; ++i){
            int fr = sc.nextInt();
            int to = sc.nextInt();
            map[fr][to] = 1;
            map[to][fr] = 1;
        }

        DFS(map, visited, start);
        System.out.println();

        visited = new int[N][N];
        Deque<Integer> que = new ArrayDeque<>();
        que.add(start);
        BFS(map, visited, que);

    }

    public void DFS(int[][] map, int[][] visited, int fr){
        System.out.printf("%d", fr);

        for(int i = 0; i < N; ++i){
            visited[i][fr] = 1;
        }
        for(int to = 0; to < N; ++to){
            if(map[fr][to] == 1 && visited[fr][to] == 0){
                DFS(map, visited, to);
            }
        }
    }

    public void BFS(int[][] map, int[][] visited, Deque<Integer> que){
        while(que.size() > 0){
            Integer fr = que.pop();
            System.out.printf("%d", fr);

            for(int i = 0; i < N; ++i){
                visited[i][fr] = 1;
            }

            for(int to = 0; to < N; ++to){
                if (map[fr][to] == 1 && visited[fr][to] == 0) {
                    if(!que.contains(to)){
                        que.add(to);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        DFS와BFS_1260 dfs와BFS_1260 = new DFS와BFS_1260();
        dfs와BFS_1260.solve();
    }
}
