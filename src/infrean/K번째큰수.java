package infrean;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수 {

    public int solution(int n , int k , int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) return x;
        }

        return answer;
    }

    public static void main(String[] args){

        K번째큰수 T = new K번째큰수();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,k,arr));

    }
}
