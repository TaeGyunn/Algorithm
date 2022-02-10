package baekjoon;

import java.util.Scanner;

public class 다리놓기_1010 {

    static int[][] dp = new int[30][30];

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int T=  scan.nextInt();     // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();


        for(int i=0; i<T; i++){
           int N = scan.nextInt();  // N = r
           int M = scan.nextInt();  // M = m

            sb.append(combi(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    static int combi(int n, int r){
        
        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) return dp[n][r];

        // n C 0 = n C n = 1
        if(n == r || r == 0) return dp[n][r] = 1;

        // n+1 C r+1 = n C r + n C r+1
        return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }

}
