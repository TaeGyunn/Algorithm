package Programmers.Level1;

public class 자연수뒤집어배열로만들기 {

    public int[] solution(long n){
        String str = new String(n + "");
        char[] Char = str.toCharArray();
        int[] answer = new int[Char.length];
        for(int i=0; i<Char.length; i++){
            answer[i] = Integer.parseInt(Char[Char.length-1-i]+"");
        }
        return answer;
    }
}
