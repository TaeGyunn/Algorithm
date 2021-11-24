package infrean2;

import java.util.Scanner;

public class 격자판최대합 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int answer = Integer.MIN_VALUE;
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<N; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<N; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for(int i=0; i<N; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][N-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}
