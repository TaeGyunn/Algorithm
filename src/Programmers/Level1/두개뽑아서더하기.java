package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers){
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!arr.contains(numbers[i]+numbers[j])){
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }
        answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
