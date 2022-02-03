package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class 이항계수1_11050 {

    static Stack<Integer> st;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

       System.out.println(combi(N,K));


    }

    static Integer combi(int n, int r){

        // n C 0 = n C n = 1
        if(r == 0 || n == r) return 1;

        // n+1 C r+1 = n C r + n C r+1
        return combi(n-1, r) + combi(n-1, r-1);
    }
}
