package book;

import java.util.Scanner;

public class 음료수얼려먹기 {

    static int N;
    static int M;
    static int[][] arr;

    public static void main(String[] args){

        int answer = 0;

        Scanner scan = new Scanner(System.in);

        N= scan.nextInt();
        M = scan.nextInt();
        scan.nextLine();
        arr = new int[N][M];


        for(int i=0; i<N; i++){
            String str = scan.nextLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(dfs(i, j)){
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
    public static boolean dfs(int x, int y){

        if(x <= -1 || x>= N || y <= -1 || y >= M) return false;

        if(arr[x][y] == 0){
            arr[x][y] = 1;

            dfs(x-1, y);
            dfs(x ,y-1);
            dfs(x +1 , y);
            dfs(x, y+1);
            return true;
        }
        return false;
    }
}
