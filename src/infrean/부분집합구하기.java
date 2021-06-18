package infrean;

import java.util.Scanner;

public class 부분집합구하기 {
    static int n;
    static int[] ch;
    public void solution(int L){
        if(L == n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i] == 1) tmp += (i+"");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        }
        else{
            ch[L] = 1;
            solution(L+1);
            ch[L ] = 0;
            solution(L+1);
        }
    }

    public static void main(String[] args){

        부분집합구하기 T = new 부분집합구하기();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        ch = new int[n+1];
        T.solution(1);

    }
}
