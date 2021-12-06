package baekjoon;

import java.util.Scanner;

public class 다음순열 {

    private static boolean nextPermutation(int[] arr){
        int i = arr.length-1;

        // A[i-1] < A[i]를 만족하는 가장 큰 i를 찾는다.
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if( i<= 0) return false;

        int j = arr.length-1;
        // j > 1이면서 A[j] > A[i-1]을 만족하는 가장 큰 j를 찾는다.
        while(arr[j] <= arr[i-1]) j--;

        swap(arr, i-1, j);
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 4;
        int[] arr = {1,2,4,3};

        if(nextPermutation(arr)){
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.println("-1");
        }

    }
}
