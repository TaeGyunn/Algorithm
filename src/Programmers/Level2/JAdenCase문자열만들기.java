package Programmers.Level2;

public class JAdenCase문자열만들기 {

    public String solution(String s){
       String answer = "";
       String[] arr = s.toLowerCase().split("");
       StringBuilder sb = new StringBuilder();

       boolean blank = true;

       for(String str : arr){
           answer += blank? str.toUpperCase() : str;
           blank = str.equals(" ")? true : false;
       }

        return answer;
    }

    public static void main(String[] args){

        JAdenCase문자열만들기 T = new JAdenCase문자열만들기();
        String s = "3people unFollowed me";
        System.out.print(T.solution(s));
    }
}
