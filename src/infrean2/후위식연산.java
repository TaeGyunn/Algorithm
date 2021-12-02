package infrean2;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        Stack<Integer> stack = new Stack<>();
        for(char x : A.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else{
                int a = stack.pop();
                int b = stack.pop();
                if(x == '+'){
                    stack.push(b + a);
                }else if(x == '-'){
                    stack.push(b - a);
                }else if(x == '*'){
                    stack.push(b * a);
                }else{
                    stack.push(b / a);
                }
            }
        }
        System.out.println(stack.pop());
    }
}
