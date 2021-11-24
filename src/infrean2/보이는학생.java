package infrean2;

import java.util.Scanner;

public class 보이는학생 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        int result = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(max < arr[i]){
                max = arr[i];
                result ++;
            }
        }
        System.out.println(result);
    }
}
