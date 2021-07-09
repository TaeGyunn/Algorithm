package Programmers.Level1;

public class 시저암호 {
    public String solution(String s, int n){
        String answer = "";
        // 'A'~'Z' 64 91
        // 'a'~'z' 96 123
        for(char x : s.toCharArray()){
            if(64<x && x<91){
                x += n;
                if(x > 90){
                    x = (char) (64 + (x - 90));
                }
                answer += x;
            }else if(96<x && x<123){
                x += n;
                if(x > 122){
                    x = (char) (96 + (x-122));
                }
                answer += x;
            }else{
                answer += " ";
            }
        }

        return answer;
    }
}
