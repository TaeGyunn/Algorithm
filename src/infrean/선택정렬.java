package infrean;

import java.util.Scanner;

public class 선택정렬 {

    public int[] solution(int n, int[] arr){
            for(int i=0; i<n-1; i++){
                int idx = 1;
                for(int j=i+1; j<n; j++){
                    if(arr[i] < arr[idx]) idx = j;
                }
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
            return arr;
    }

    public static void main(String[] args){

        선택정렬 T = new 선택정렬();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(int x : T.solution(n,arr))System.out.print(x + " ");


    }
}
