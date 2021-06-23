package Programmers.Level2;

public class 숫자의표현 {

    public int solution(int n){
        int answer = 0;
        int sum;
        for(int lt = 1; lt<=n; lt++){
            sum = 0;
            for(int rt = lt; rt<=n; rt++){
                sum += rt;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n)
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        숫자의표현 T = new 숫자의표현();
        int n = 1;
        System.out.print(T.solution(n));
    }
}
