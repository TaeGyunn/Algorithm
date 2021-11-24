package infrean2;

import java.util.Scanner;

public class 봉우리 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] map = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                map[i][j] = scan.nextInt();
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int answer=0;

        for(int i=0; i<N; i++){
            for(int j=0; j < N; j++){
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] >= map[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        System.out.println(answer);


    }
}
