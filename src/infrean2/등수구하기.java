package infrean2;

import java.util.Scanner;

public class 등수구하기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        int[] rank = new int[N];

        for(int i=0; i<N; i++){
            int cnt=1;
            for(int j=0; j<N; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            rank[i]=cnt;
        }
    }
}
