package infrean2;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                stack.push('(');
            }else if(A.charAt(i) == ')'){
                stack.pop();
            }else if(stack.empty()){
                answer += A.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
