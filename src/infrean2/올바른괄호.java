package infrean2;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String answer = "";

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '(' ){
                stack.push(A.charAt(i));
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            answer = "YES";
        }else{
            answer ="NO";
        }
        System.out.println(answer);
    }
}
