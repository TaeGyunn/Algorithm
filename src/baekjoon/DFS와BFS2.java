package baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DFS와BFS2 {

    public static int N;

    public static void main(String[] args){

        Scanner scan  = new Scanner(System.in);

        N = scan.nextInt() + 1;
        int M = scan.nextInt();
        int start = scan.nextInt();

        int[][] map = new int[N][N];
        int[][] visited = new int[N][N];

        for(int i=0; i<M; i++){
            int fr = scan.nextInt();
            int to = scan.nextInt();
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

    public static void DFS(int[][] map,int[][] visited ,int fr){
        System.out.print(fr + " ");

        for(int i=0; i<N; i++){
            visited[i][fr] = 1;
        }

        for(int to = 0; to<N; to++){
            if(map[fr][to] == 1 &&  visited[fr][to] == 0){
                DFS(map, visited, to);
            }
        }
    }

    public static void BFS(int[][] map, int[][] visited, Deque<Integer> que){

        while(que.size() > 0){
            Integer fr = que.pop();
            System.out.printf("%d ", fr);

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
}
