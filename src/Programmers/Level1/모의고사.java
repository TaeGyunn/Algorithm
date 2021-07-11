package Programmers.Level1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers){
        int[] answer = {};
        int[] per1 = {1,2,3,4,5};
        int[] per2 = {2,1,2,3,2,4,2,5};
        int[] per3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1 =0, answer2 = 0, answer3 = 0;

        for(int i=0; i<answers.length; i++){
            if(per1[i%per1.length] == answers[i]) answer1 ++;
            if(per2[i%per2.length] == answers[i]) answer2 ++;
            if(per3[i%per3.length] == answers[i]) answer3 ++;
        }
        int max = Math.max(Math.max(answer1, answer2), answer3);    //max값 구하기
        ArrayList<Integer> list = new ArrayList<>();
        if(max == answer1) list.add(1);
        if(max == answer2) list.add(2);
        if(max == answer3) list.add(3);

        answer = new int[list.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
