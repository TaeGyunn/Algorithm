package infrean2;

import java.util.HashSet;
import java.util.Scanner;

public class 매출액의종류 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<K; i++){
            for(int j=i; j<i+K; j++){
                hashSet.add(arr[j]);
            }
            System.out.print(hashSet.size() +" ");
            hashSet.clear();
        }
    }
}
