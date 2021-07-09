package Programmers.Level1;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {

    public String[] solution(String[] strings, int n){
        String[] answer = {};
        answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String addOn = strings[i].substring(n, n + 1);
            strings[i] = addOn + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }

        return answer;
    }
}
