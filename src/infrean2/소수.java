package infrean2;

import java.util.Scanner;

public class 소수 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int cnt = 0;
        int[] ch = new int[N+1];
        for(int i=2; i<=N; i++){
            if(ch[i] == 0){
                cnt ++;
                for(int j=1; j<N; j = j+i) ch[i] = 1;
            }
        }
        System.out.println(cnt);
    }
}
