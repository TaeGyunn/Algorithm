package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor){
        int[] answer = {};
        Arrays.sort(arr);
        int cnt = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                tmp.add(arr[i]);
                cnt++;
            }
        }
        answer = new int[tmp.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = tmp.get(i);
        }
        if(cnt == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
