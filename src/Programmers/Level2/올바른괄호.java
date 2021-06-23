package Programmers.Level2;

import java.util.Stack;

public class 올바른괄호 {

    boolean solution(String s){
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else if(!stack.isEmpty()){
                stack.pop();
            }else{
                answer = false;
            }
        }

        if(!stack.empty()){
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args){

        올바른괄호 T = new 올바른괄호();
        String s  = "(()(";
        System.out.print(T.solution(s));
    }
}
