package infrean2;

import java.util.Scanner;

public class 가장짧은문자거리 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        char B = scan.next().charAt(0);

        int[] answer = new int[A.length()];
        char[] arr = A.toCharArray();
        int max = 1000;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == B){
                max = 0;
                answer[i] = max;
            }else{
                max++;
                answer[i] = max;
            }
        }

        max = 1000;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == B){
                max = 0;
            }else{
                max++;
                answer[i] = Math.min(answer[i], max);
            }
        }
        for(int i : answer){
                System.out.print(i + " ");
        }
    }
}
