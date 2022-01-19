package book;

import java.util.Scanner;

public class 개미전사 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i=0; i<N; i ++){
            if(i % 2 == 0){
              even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        System.out.println(Math.max(even, odd));

    }
}
