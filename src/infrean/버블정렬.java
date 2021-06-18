package infrean;

import java.util.Scanner;

public class 버블정렬 {

    public int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[i];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){

        버블정렬 T = new 버블정렬();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
            for(int x : T.solution(n, arr)) System.out.print(x+" ");
        }


    }
}
