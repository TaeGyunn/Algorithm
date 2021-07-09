package Programmers.Level1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {

    public String solution(String s){
        Character [] arr = new Character [s.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        s = "";
        for(int i=0; i<arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
