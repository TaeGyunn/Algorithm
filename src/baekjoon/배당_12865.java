package baekjoon;

import java.util.Scanner;

public class 배당_12865 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[][] arr = new int[N+1][2];
        int[][] arr2 = new int[N+1][100001];

        for(int i=1; i<=N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=K; j++){
                int a = arr[i][0];
                int b = arr[i][1];

                if(j - a >= 0){
                    arr2[i][j]  = Math.max(arr2[i-1][j-a]+b , arr2[i-1][j]);
                }else{
                    arr2[i][j] = arr2[i-1][j];
                }
            }
        }

        System.out.println(arr2[N][K]);
    }
}
