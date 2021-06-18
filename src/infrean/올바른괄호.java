package infrean;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else if(!stack.isEmpty() && x == ')'){
                stack.pop();
            }else {
                answer = "NO";
            }
        }
        if(!stack.isEmpty()){
            answer ="NO";
        }
        return answer;
    }

    public static void main(String[] args){
        올바른괄호 T = new 올바른괄호();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
