package Programmers.Level1;

public class 문자열다루기기본 {

    public boolean solution(String s){
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            answer = s.matches("^[0-9]*$");
        }

        return answer;
    }
}
