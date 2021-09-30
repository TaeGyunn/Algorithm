package Programmers.Level2;

public class N진수게임 {
    // 진법 n, 미리 구할 숫자의 개수 t, 게임에 참여하는 인원 m, 튜브의 순서 p
    public static void main(String[] args){
        System.out.println(solution(16,16,2,1));
    }

    public static String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        int num = 0;

        while(sb.length() < m * t){
            sb.append(Integer.toString(num++, n));
        }
        for(int i = p-1; i<m * t; i = i+m){
            answer.append(sb.charAt(i));
        }
        return answer.toString().toUpperCase();
    }

}
