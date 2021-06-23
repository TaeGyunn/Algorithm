package Programmers.Level2;

public class 최댓값과최솟값 {

    public String solution(String s){
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] arr = {};
        arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }
            if(Integer.parseInt(arr[i]) > max){
                max  =Integer.parseInt(arr[i]);
            }
        }
        answer += min+" " +max;

        return answer;
    }

    public static void main(String[] args){

        최댓값과최솟값 T = new 최댓값과최솟값();
        String s = "-1 -1";
        System.out.print(T.solution(s));
    }
}
