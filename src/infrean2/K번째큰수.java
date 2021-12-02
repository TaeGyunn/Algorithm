package infrean2;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        TreeSet<Integer> hashSet = new TreeSet<>(Collections.reverseOrder());
        for(int lt = 0; lt < N; lt++){
            for(int mt = lt+1; mt<N; mt++){
                for(int rt = mt+1; rt<N; rt++){
                    int answer = (arr[lt] + arr[mt] + arr[rt]);
                    hashSet.add(answer);
                }
            }
        }
        int cnt = 0;
        int answer = -1;
        for(int x : hashSet){
            cnt ++;
            if(cnt == K) answer = x;
        }
        System.out.println(answer);

    }
}
