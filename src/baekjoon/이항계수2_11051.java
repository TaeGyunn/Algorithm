package baekjoon;

import java.util.Scanner;

public class 이항계수2_11051 {

    static int[][] dp;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        dp = new int[N+1][N+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                // nCn = nC0 = 1
                if (i == j || j == 0) {
                    dp[i][j] = 1;
                } else {
                    // n+1 C r+1 = n C r + n C r+1
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
