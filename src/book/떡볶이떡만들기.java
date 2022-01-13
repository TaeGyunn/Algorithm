package book;

import java.util.Arrays;
import java.util.Scanner;

public class 떡볶이떡만들기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[N-1];

        while(true){
            int sum = 0;
            for(int num : arr){
                if(num >= max){
                    sum += num - max;
                }
            }
            if(sum == M) break;
            max--;
        }
        System.out.println(max);
    }
}
