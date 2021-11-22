package infrean2;

import java.util.Scanner;

public class 문자열압축 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String answer = "";
        A = A + "";
        int cnt = 1;
        for(int i=0; i<A.length()-1; i++){
            if(A.charAt(i) == A.charAt(i+1)) cnt ++;
            else{
                answer += A.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(answer);

    }
}
