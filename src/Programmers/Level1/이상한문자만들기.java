package Programmers.Level1;

public class 이상한문자만들기 {

    public String solution(String s){
        String answer = "";
        String[] arr;
        arr = s.split(" ",-1);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                if(j%2 == 0) {
                    answer += arr[i].substring(j, j + 1).toUpperCase();
                }else{
                    answer += arr[i].substring(j,j+1).toLowerCase();
                }
            }
            if(i!=arr.length-1) {
                answer += " ";
            }
        }
        return answer;
    }
}
