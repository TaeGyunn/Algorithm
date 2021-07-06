package Programmers.Level1;

public class 최대공약수와최소공배수 {

    int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public int[] solution(int n, int m){
        int[] answer = {};
        answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = n*m/gcd(n,m);
        return answer;
    }
}
