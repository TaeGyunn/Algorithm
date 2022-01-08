package Programmers.Level2;

public class 예상대진표 {

    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int left = 0;
        int right = 0;

        if(a > b){
            left = b;
            right = a;
        }else{
            left = a;
            right = b;
        }
        boolean run = true;
        while(run){

            if(left % 2 != 0 && right - left == 1) break;

            left = (left + 1) / 2;
            right = (right + 1) / 2;

            answer ++;
        }

        return answer;
    }

}
