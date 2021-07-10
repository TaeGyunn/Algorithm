package Programmers.Level1;

import java.util.ArrayList;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums){
        int[] answer = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<win_nums.length; i++){
            arr.add(win_nums[i]);
        }
        //win
        int win_cnt = 0;
        for(int i=0; i<lottos.length; i++){
            if(arr.contains(lottos[i]) || lottos[i] == 0){
                win_cnt++;
            }
        }
        //lose
        int lose_cnt = 0;
        for(int i=0; i<lottos.length; i++){
            if(arr.contains(lottos[i])){
                lose_cnt++;
            }
        }
        switch (win_cnt){
            case 6 : answer[0] = 1;
                     break;
            case 5 : answer[0] = 2;
                     break;
            case 4 : answer[0] = 3;
                     break;
            case 3 : answer[0] = 4;
                     break;
            case 2 : answer[0] = 5;
                     break;
            case 1 : answer[0] = 6;
                     break;
            case 0 : answer[0] = 6;
                     break;

        }

        switch (lose_cnt){
            case 6 : answer[1] = 1;
                break;
            case 5 : answer[1] = 2;
                break;
            case 4 : answer[1] = 3;
                break;
            case 3 : answer[1] = 4;
                break;
            case 2 : answer[1] = 5;
                break;
            case 1 : answer[1] = 6;

            case 0 : answer[1] = 6;
                break;
        }


        return answer;
    }
}
