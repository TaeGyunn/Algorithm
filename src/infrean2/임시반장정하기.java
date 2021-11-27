package infrean2;

import java.util.Scanner;

public class 임시반장정하기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int answer=0, max=0;
        for(int i=1; i<=N; i++){
            int cnt=0;
            for(int j=1; j<=N; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
         System.out.println(answer);
    }
}
