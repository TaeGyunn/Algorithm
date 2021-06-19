package Programmers.Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 오픈채팅방 {

    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String > arr = new ArrayList<>();
        for(String x : record){
            StringTokenizer st = new StringTokenizer(x);
            String state =  st.nextToken();
            String id = st.nextToken();
            String nickname = "";
            if(!state.equals("Leave")) {
                nickname = st.nextToken();
            }
            if(state.equals("Enter")){
                map.put(id, nickname);
                arr.add(id + "님이 들어왔습니다.");
            }else if(state.equals("Change")){
                map.put(id,nickname);
            }else{
                arr.add(id +"님이 나갔습니다.");
            }
        }
        answer = new String[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            int idx = arr.get(i).indexOf("님");
            String id = arr.get(i).substring(0,idx);
            String[] temp = arr.get(i).split(" ");
            answer[i] = map.get(id) + "님이 " + temp[1];
        }

        return answer;
    }

    public static void main(String[] args){

        오픈채팅방 T = new 오픈채팅방();
        Scanner scan = new Scanner(System.in);
        String[] record = new String[5];
        record[0] = "Enter uid1234 Muzi";
        record[1] = "Enter uid4567 Prodo";
        record[2] = "Leave uid1234";
        record[3] = "Enter uid1234 Prodo";
        record[4] = "Change uid4567 Ryan";
        for(String x : T.solution(record)){
            System.out.println(x);
        }
    }
}
