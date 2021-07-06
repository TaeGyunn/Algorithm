package Programmers.Level1;

public class x만큼간격이있는n개의숫자 {

    public long[] solution(long x, int n){
        long[] answer = {};
        answer = new long[n];
        long tmp = x;
        for(int i=0; i<n; i++){
            if(i == 0){
                answer[i]=x;
            }else {
                x = x + tmp;
                answer[i] = x;
            }
        }
        return answer;
    }
}
