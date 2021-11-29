package Programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 매출원가 {

    public static void main(String[] args){
        String[] record = new String[6];
        record[0] = "P 100 4";
        record[1] = "P 300 9";
        record[2] = "S 1000 7";
        record[3] = "P 1000 8";
        record[4] = "S 700 7";
        record[5] = "S 700 3";

        for(int x : solution(record)){
            System.out.println(x);
        }
    }

    public static int[] solution(String[] record){

        // record 배열 분리
        String[][] arr = new String[record.length][3];

        for(int i=0; i< record.length; i++){
            arr[i] = record[i].split(" ");
        }

        Queue<Integer> qp = new LinkedList<>();
        Queue<Integer> qc = new LinkedList<>();
        int[] answer = new int[2];
        //선입선출
        for(int i=0; i<arr.length; i++){
            if(arr[i][0].equals("P")){
                qp.add(Integer.parseInt(arr[i][1]));
                qc.add(Integer.parseInt(arr[i][2]));
            }else{
                if(qc.peek() > Integer.parseInt(arr[i][2])){
                    answer[0] += Integer.parseInt(arr[i][2]) * qp.peek();
                   qc.add(qc.poll() - Integer.parseInt(arr[i][2]));
                }else{
                    int rest = Integer.parseInt(arr[i][2]) - qc.poll();
                    answer[0] += (Integer.parseInt(arr[i][2]) - rest) * qp.poll();
                    answer[0] += rest * qp.peek();
                    qc.add(qc.poll() - rest);
                }
            }
        }
        //후입선출
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i][0].equals("P")){
                stack1.push(Integer.parseInt(arr[i][1]));
                stack2.push(Integer.parseInt(arr[i][2]));

            }else{
                if(stack2.peek() > Integer.parseInt(arr[i][2])){
                    answer[1] += Integer.parseInt(arr[i][2]) * stack1.peek();
                    stack2.push(stack2.pop() - Integer.parseInt(arr[i][2]));
                }else{
                    int rest = Integer.parseInt(arr[i][2]) - stack2.pop();
                    answer[1] += (Integer.parseInt(arr[i][2]) - rest) * stack1.pop();
                    answer[1] += rest * stack1.peek();

                    stack2.push(stack2.pop() - rest);
                }
            }
        }


        return answer;

    }
}
