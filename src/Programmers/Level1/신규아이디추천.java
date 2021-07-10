package Programmers.Level1;

public class 신규아이디추천 {
    public String solution(String new_id){
       String answer = new_id.toLowerCase();

       answer = answer.replaceAll("[^0-9a-z-_.]","");
       answer = answer.replaceAll("[.]{2,}",".");
       answer = answer.replaceAll("^[.]{1}","");

       if(answer.equals("")) answer += "a";
       if(answer.length() >= 16) answer = answer.substring(0,15);
       answer = answer.replaceAll("[.]{1}$","");

       if(answer.length() <= 2){
           for(int i=answer.length(); i<3; i++){
               answer += answer.substring(answer.length()-1);
           }
       }
       return answer;
    }
}
