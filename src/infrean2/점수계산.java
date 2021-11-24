package infrean2;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int result = 0;
        int cnt = 0;
        for(int i=0; i<N; i++){
            if(arr[i] == 1){
                cnt ++;
                result += cnt;
            }else{
                cnt = 0;
            }
        }
        System.out.println(result);
    }
}
