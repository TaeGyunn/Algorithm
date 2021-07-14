package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class 스킬체크테스트1 {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.substring(i,i+1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<s.length(); i++){
            answer += arr[i];
        }
        return answer;
    }
}
