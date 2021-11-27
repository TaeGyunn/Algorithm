package infrean2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두배열합치기 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<>();

        int N = scan.nextInt();
        int[] arr1 = new int[N];
        for(int i=0; i<N; i++){
            arr1[i] = scan.nextInt();
            result.add(arr1[i]);
        }

        int M = scan.nextInt();
        int[] arr2 = new int[M];
        for(int i=0; i<M; i++){
            arr2[i] = scan.nextInt();
            result.add(arr2[i]);
        }

        Collections.sort(result);
        for(int x : result){
            System.out.print(x+" ");
        }


    }
}
