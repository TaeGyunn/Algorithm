package Programmers.Level2;

public class 점프와순간이동 {

    public int solution(int n){
        int answer = 1;

        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n--;
                answer++;
            }
        }

        return answer;

    }

     public static void main(String[] args){
         점프와순간이동 T = new 점프와순간이동();

         int n = 5000;
         System.out.print(T.solution(n));
     }
}
