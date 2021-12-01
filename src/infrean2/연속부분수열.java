package infrean2;

import java.util.Scanner;

public class 연속부분수열 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int answer = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=i; j<N; j++){
                sum += arr[j];
                if(sum == M){
                    answer ++;
                    break;
                }
            }
        }
        System.out.println(answer);

    }
}
