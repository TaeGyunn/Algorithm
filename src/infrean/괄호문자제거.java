package infrean;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else if(x == ')' && !stack.isEmpty()){
                stack.pop();
            }else if(stack.isEmpty()){
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        괄호문자제거 T = new 괄호문자제거();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
