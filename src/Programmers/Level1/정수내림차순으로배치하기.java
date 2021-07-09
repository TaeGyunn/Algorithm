package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

    public long solution(long n){
        long answer = 0;
        String num = Long.toString(n);
        Character[] arr = new Character[num.length()];
        for(int i=0; i<num.length(); i++){
            arr[i] = num.charAt(i);
        }
        String tmp = "";
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            tmp += arr[i];
        }
       answer = Long.parseLong(tmp);
        return answer;
    }
}
