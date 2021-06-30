package Programmers.Level2;

import java.util.ArrayList;

public class 영어끝말잇기 {

    public int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            if(temp.isEmpty()){
                temp.add(word);
                continue;
            }
            if(!temp.contains(word) && words[i-1].charAt(words[i-1].length()-1)
                    == word.charAt(0)){
                temp.add(word);
            }else{
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args){

        int n;
        String[] words;
    }
}
