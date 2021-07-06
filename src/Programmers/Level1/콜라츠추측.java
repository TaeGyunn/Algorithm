package Programmers.Level1;

public class 콜라츠추측 {

     public int solution(double num){
         int answer = -1;
         int cnt = 0;
        while(num != 1){
            if(num%2 == 0){
                num = num/2;
                cnt++;
                if(cnt >500){
                    num = 1;
                }
            }else{
                num = num*3 + 1;
                cnt++;
                if(cnt >500){
                    num = 1;

                }
            }
        }
        if(cnt <= 500){
            answer = cnt;
        }
         return answer;
     }
}
