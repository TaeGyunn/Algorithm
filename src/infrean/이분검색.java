package infrean;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public int solution(int n, int m, int[] arr){
        int idx = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i] == m) idx = i+1;
        }
        return idx;
    }


    public static void main(String[] args){
        이분검색 T = new 이분검색();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
