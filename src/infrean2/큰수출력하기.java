package infrean2;

import java.util.Scanner;

public class 큰수출력하기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<N; i++){
            if(arr[i] >= N){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
