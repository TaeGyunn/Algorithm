package Programmers.Level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

    public int[] solution(int[] arr){
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();
        array.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                array.add(arr[i]);
            }
        }
        answer = new int[array.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = array.get(i);
        }

        return answer;

    }
}
