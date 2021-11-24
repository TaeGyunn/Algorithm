package infrean2;

import java.util.Scanner;

public class 암호 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        String B = scan.next();
        String answer = "";
       for(int i=0; i<A; i++){
           String tmp = B.substring(0,7).replace('#', '1').replace('*','0');
           int num = Integer.parseInt(tmp, 2);
           answer += (char)num;
           B = B.substring(7);
       }
        System.out.println(answer);

    }
}
