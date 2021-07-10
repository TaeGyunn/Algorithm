package Programmers.Level1;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        int num = 0;
        for(int i=0; i<participant.length; i++){
            if(map.get(participant[i]) == null){
                map.put(participant[i],1);
            }else {
                    num = map.get(participant[i]) + 1;
                    map.put(participant[i],num);
                }
            }

        for(int j=0; j<completion.length; j++){
            num = map.get(completion[j])-1;
            map.put(completion[j],num);
        }
        for(String key : map.keySet()){
            if(map.get(key) == 1) answer = key;
        }
        return answer;
    }
}
