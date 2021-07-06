package Programmers.Level1;

public class 핸드폰번호가리기 {

    public String solution(String phone_number){
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            phone_number=phone_number.replaceFirst(phone_number.substring(i,i+1),"*");
        }
        answer = phone_number;
        return answer;
    }
}
