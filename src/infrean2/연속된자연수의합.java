package infrean2;

import java.util.Scanner;

public class 연속된자연수의합 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int answer = 0;
        for(int i=1; i<=N/2+1; i++){
            int sum = 0;
            for(int j=i; j<=N/2+1; j++){
                sum += j;
                if(sum == N){
                    answer ++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
