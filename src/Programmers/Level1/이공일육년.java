package Programmers.Level1;

public class 이공일육년 {
    public String solution(int a , int b){
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for(int i=0; i<12; i++){
            if(i == a-1){
                for(int j=0; j<a-1; j++) {
                    sum += month[j];
                }
                sum += b-1;
                sum = sum%7;

            }
        }
        answer = day[sum];
        return answer;
    }
}
