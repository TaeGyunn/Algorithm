package Programmers.Level1;

public class 삼진법뒤집기 {

    public int solution(int n){
        int answer = 0;
        String str = "";
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            str = (n%3) + str;
            n/=3;
        }
        str = sb.append(str).reverse().toString();
        answer = Integer.parseInt(str,3);
        return answer;
    }
}
