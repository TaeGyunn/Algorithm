package Programmers.Level1;

public class 하샤드수 {
    public boolean solution(int x){
        boolean answer = false;
        int num = 0;
        int tmp = x;
        while(tmp != 0){
            num += tmp%10;
            tmp /=10;
        }
        if(x%num == 0){
            answer = true;
        }
        return answer;
    }
}
