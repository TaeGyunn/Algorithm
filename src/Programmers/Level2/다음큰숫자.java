package Programmers.Level2;

public class 다음큰숫자 {

    // Integer.bitCount()메소드를 사용하면 입력된 정수를 2진수로 변환뒤, 포함된 1을 카운팅 한다고 한다.

    public int solution(int n){
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }

        for(int i= n+1; i<1000001; i++){
            String temp = Integer.toBinaryString(i);
            int cnt2 = 0;
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j) == '1')cnt2++;
            }

            if(cnt2 == cnt){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        다음큰숫자 T = new 다음큰숫자();
        int n = 78;
        System.out.print(T.solution(n));
    }
}
