package infrean2;

import java.util.Scanner;

public class 숫자만추출 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();

        String answer = "";
        for(char x : A.toCharArray()){
            if(x >= 48 && x <= 57){
                answer += x;
            }
        }
        int answer1 = Integer.parseInt(answer);
        System.out.println(answer1);
    }
}
