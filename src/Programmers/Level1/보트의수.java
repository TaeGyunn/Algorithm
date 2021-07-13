package Programmers.Level1;

public class 보트의수 {
    public int solution(int[] d, int m) {
        int answer = 0;
        int box = 1;
        int cnt = 0;
        for(int i=0; i<d.length; i++){
            if(d[i] >= box){
                cnt++;
                m-=box;
                box = box*2;
            }else{
                box = 1;
                cnt++;
            }
            if(m <0){
                break;
            }
        }
        answer = cnt;
        if(m > 0){
            answer = -1;
        }
        return answer;
    }
}
