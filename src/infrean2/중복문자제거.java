package infrean2;

import java.util.Scanner;

public class 중복문자제거 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String answer = "";

        for(int i=0; i<A.length(); i++){
            if(A.indexOf(A.charAt(i))==i) answer+=A.charAt(i);
        }
        System.out.println(answer);


    }
}
