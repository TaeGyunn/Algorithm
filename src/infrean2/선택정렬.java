package infrean2;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
    }
}
