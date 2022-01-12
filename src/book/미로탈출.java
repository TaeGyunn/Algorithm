package book;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탈출 {

    static int N;
    static int M;
    static int[][] arr;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        scan.nextLine();

        arr = new int[N][M];

        for(int i =0; i<N; i++ ){
            String str = scan.nextLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

      System.out.println(bfs(0,0));

    }
    public static int bfs(int x, int y){

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.x;
            y = node.y;

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >=M) continue;

                if(arr[nx][ny] == 1){
                    arr[nx][ny] = arr[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }

        return arr[N-1][M-1];
    }
}
