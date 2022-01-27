package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {

    public class Node{
        int x; 
        int y;

        public Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }

    static boolean [][] check;
    static int[] dx = {1,0,-1,0}; // x방향
    static int[] dy = {0,1,0,-1}; // y방향
    static int[][] map;
    static int n;
    static int m;

    public int solution(int[][] maps) {
        int answer = 0;

        n = maps.length;
        m = maps[0].length;
        check = new boolean[n][m];

        check[0][0] = true;
        BFS(0, 0);

        answer = map[n-1][m-1];
        return answer > 1 ? map[n-1][m-1] : -1;
    }

    public void BFS(int y, int x) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(y, x));

        while(!queue.isEmpty()){
            Node now = queue.poll();

            for(int i=0; i<4; i++){
                int now_y = now.y + dy[i];
                int now_x = now.x + dx[i];

                if(0 <= now_y && now_y < n && 0<= now_x && now_x < m){
                    if(map[now_y][now_x] != 0 && !check[now_y][now_x]){
                        queue.add(new Node(now_y, now_x));
                        check[now_y][now_x] = true;
                        map[now_y][now_x] = map[now.y][now.x] + 1;
                    }
                }
            }
        }
    }
}
