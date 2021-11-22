package infrean2;

import java.util.Scanner;

public class 회문문자열 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        A = A.toLowerCase();
        if(A.equals(new StringBuilder(A).reverse().toString())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
