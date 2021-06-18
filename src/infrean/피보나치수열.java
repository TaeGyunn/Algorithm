package infrean;

import java.util.Scanner;

public class 피보나치수열 {

    public int solution(int n){
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return solution(n-2) + solution(n-1);
    }

    public static void main(String[] args){

        피보나치수열 T = new 피보나치수열();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(T.solution(n) + " ");
        }
    }
}
