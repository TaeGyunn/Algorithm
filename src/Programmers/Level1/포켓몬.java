package Programmers.Level1;

import java.util.ArrayList;

public class 포켓몬 {
    public int solution(int[] nums){
        int answer = 0;
        int max = nums.length/2;
        ArrayList<Integer >arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        if(arr.size() >= max){
            answer = max;
        }else{
            answer = arr.size();
        }

        return answer;
    }
}
