package Programmers.Level2;

public class 피보나치수 {

    public int solution(int n){
        int answer  = 0;
        int num1 = 1;
        int num2 = 1;

        if(n == 1 || n==2) return 1;
        else{
            for(int i=3; i<=n; i++){
                answer = (num1 + num2) % 1234567;
                num1 = num2;
                num2 = answer;
            }
            return answer;
        }
    }

    public static void main(String[] args){
        피보나치수 T = new 피보나치수();
        int n = 5;
        System.out.print(T.solution(n));


    }
}
