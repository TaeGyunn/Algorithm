package Programmers.Level2;

public class 이진변환반복하기 {

    public int[] solution(String s){
        int[] answer = {};
        answer = new int[2];
        int cnt = 0;
        int remove = 0;

        while(!s.equals("1")){
           String tmp = "";
           for(char x : s.toCharArray()){
               if(x == '1'){
                   tmp += x;
               }else{
                   remove++;
               }
           }
        s = Integer.toBinaryString(tmp.length());
           cnt++;
        }
        answer[0] = cnt;
        answer[1] = remove;

        return answer;
    }

    public static void main(String[] args){

    }
}
