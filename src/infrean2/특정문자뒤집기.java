package infrean2;

import java.util.Scanner;

public class 특정문자뒤집기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String answer;

        char[] s = A.toCharArray();
        int lt = 0 , rt = A.length()-1;
        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        System.out.println(answer);
    }
}
