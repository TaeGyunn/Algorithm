package Programmers.Level2;

public class 백이십사나라의숫자 {

    public String solution(int n){
        String[] num = {"4", "1", "2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n-1) / 3;
        }
        return answer;
    }

    public static void main(String[] args){

        백이십사나라의숫자 T = new 백이십사나라의숫자();
        System.out.println(T.solution(10));
    }
}
