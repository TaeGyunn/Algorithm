package Programmers.Level1;

import java.util.Stack;

public class 출금내역 {
    public int[] solution(int[] deposit) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<deposit.length; i++){
            if(stack.isEmpty()){
                stack.push(deposit[i]);
            }else if(deposit[i] > 0){
                stack.push(deposit[i]);
            }else{
                if(stack.peek() + deposit[i] > 0){
                    int num = stack.pop() + deposit[i];
                    stack.push(num);
                }else{
                    int num = stack.pop() +deposit[i];
                    while(num < 0){
                        num = stack.pop() + num;
                    }
                    if(num!=0) {
                        stack.push(num);
                    }
                }
            }
        }
        answer = new int[stack.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}
