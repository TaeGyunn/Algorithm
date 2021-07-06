package Programmers.Level1;

public class 평균구하기 {

    public double solution(int[] arr){
        double answer = 0;
        double num = 0;
        for(int i=0; i<arr.length; i++){
            num += arr[i];
        }
        num = num / arr.length;
        answer = num;
        return answer;
    }
}
