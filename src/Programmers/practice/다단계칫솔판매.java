package Programmers.practice;

import java.util.HashMap;
import java.util.Map;

public class 다단계칫솔판매 {

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        int[] answer = new int[enroll.length];

        Map<String, String> parentMap = new HashMap<>();
        Map<String, Integer> memberIndexMap = new HashMap<>();

        for(int i=0; i<enroll.length; i++){
            parentMap.put(enroll[i], referral[i]);
            memberIndexMap.put(enroll[i], i);
        }

        for(int i=0; i<seller.length; i++){

            String now = seller[i];             // 판매인
            int profit = 100 * amount[i];       // 개수 * 100

            while(!now.equals("-")){
                int profitForParent = profit / 10;  // 부모에게 넘겨줄 금액
                int nowProfit = profit - profitForParent;   // 판매자가 가져갈 금액

                // 자신의 index에 금액만큼 더함
                answer[memberIndexMap.get(now)] += nowProfit;

                // 노드는 부모로 이동하면서 수익을 부모에게 넘겨준 금액으로 초기화
                now = parentMap.get(now);
                profit /= 10;

                // 이득금이 1미만일때
                if(profit < 1){
                    break;
                }
            }
        }
        return answer;
    }
}
