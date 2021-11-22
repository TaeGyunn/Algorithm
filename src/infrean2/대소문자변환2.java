package infrean2;

import java.util.Scanner;

public class 대소문자변환2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String answer = "";
        for(char x : A.toCharArray()){
            if(x >= 97 && x <= 122){
                answer += (char)(x-32);
            }else{
                answer += (char)(x+32);
            }
        }
        System.out.println(answer);
    }
}
