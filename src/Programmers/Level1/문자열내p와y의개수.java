package Programmers.Level1;

public class 문자열내p와y의개수 {
    boolean solution(String s){
        boolean answer = false;
        int a = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p'){
                a ++;
            }else if(s.charAt(i) =='Y' || s.charAt(i) == 'y'){
                b++;
            }
        }
        if(a == b){
            answer = true;
        }

        return answer;
    }

}
