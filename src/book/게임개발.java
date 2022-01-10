package book;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 게임개발 {

    public static class Node {
        int x, y, d;
        Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    public static int N, M, cnt;
    public static int[][] arr;
    public static boolean[][] visit;
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {-1, 0, 1, 0};
    public static Queue<Node> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        arr = new int[N][M];
        visit = new boolean[N][M];

        String[] location = br.readLine().split(" ");

        int x = Integer.parseInt(location[0]);
        int y = Integer.parseInt(location[1]);
        int d = Integer.parseInt(location[2]);
        // 플레이어의 최초 위치와 방향 지정
        que.add(new Node(x, y, d));

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void bfs() {
        while(!que.isEmpty()) {
            Node node = que.poll();
            int isVisit = 1;
            // 플레이어 회전
            for (int i = 0; i < 4; i++) {

                int idx = (node.d + i) % 4;
                int xx = node.x + dx[idx], yy = node.y + dy[idx];
                if(xx < N && yy < N & xx >= 0 && yy >= 0) {
                    if(!visit[xx][yy] && arr[xx][yy] != 1) {
                        visit[xx][yy] = true;
                        cnt++;
                        que.add(new Node(xx, yy, idx));
                    }else {
                        isVisit++;
                    }
                }
            }

            if(isVisit == 4) {
                int idx = (node.d+2)%4;
                int xx = node.x + dx[idx];
                int yy = node.y + dy[idx];
                if(arr[xx][yy] != 1) {
                    que.add(new Node(xx, yy, node.d));
                }else {
                    break;
                }
            }
        }


    }
}
