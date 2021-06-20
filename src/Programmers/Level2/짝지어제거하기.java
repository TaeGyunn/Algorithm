package Programmers.Level2;

import java.util.Scanner;
import java.util.Stack;

public class 짝지어제거하기 {

    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(Character x : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(x);
            }else if(stack.peek() == x){
                stack.pop();
            }else{
                stack.push(x);
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }

        return answer;
    }

    public static void main(String[] args){

        짝지어제거하기 T = new 짝지어제거하기();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(T.solution(s));
    }
}
