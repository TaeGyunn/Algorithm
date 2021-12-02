package infrean2;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(A.charAt(i-1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        System.out.println(cnt);
    }
}
