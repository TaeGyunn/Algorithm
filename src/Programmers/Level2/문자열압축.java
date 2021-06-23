package Programmers.Level2;

import java.util.Scanner;

public class 문자열압축 {

    public int solution(String s){
        int num = 1;
        String tmp = "";
        int answer = 0;
        int answer2 = s.length();

        for(int i=1; i<=s.length()/2; i++){
            for(int j=0; j<=s.length(); j+=i){
                if(i <= s.substring(j).length()){
                    if(tmp.matches(s.substring(j, j+1))) num++;
                    else{
                        if(num > 1) answer += Integer.toString(num).length();
                        answer += tmp.length();
                        tmp = s.substring(j, j+1);
                        num = 1;
                    }
                }else{
                    if(num > 1) answer += Integer.toString(num).length();
                    answer += s.substring(j-i).length();
                }
            }
            if(answer2 > answer) answer2 = answer;
            answer = 0;
            num = 1;
            tmp = "";
        }
        return answer2;
    }

    public static void main(String[] args){

        문자열압축 T = new 문자열압축();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println();
    }
}
