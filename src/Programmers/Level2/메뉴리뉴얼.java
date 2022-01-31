package Programmers.Level2;

import java.util.*;

public class 메뉴리뉴얼 {
    // https://programmers.co.kr/learn/courses/30/lessons/72411

    static HashMap<String, Integer> map;

    public ArrayList<String> solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();

        // 1. 각 문자열을 오름차순으로 정렬
        for(int i=0; i< orders.length; i++){
            char[] charArr = orders[i].toCharArray();
            Arrays.sort(charArr);
            orders[i] = String.valueOf(charArr);
        }

        // 2. course의 길이만큼 반복하여 필요한 조합을 구함
        for(int i=0; i<course.length; i++){

            map = new HashMap<>();
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < orders.length; j++){
                StringBuilder sb = new StringBuilder();
                if(course[i] <= orders[j].length()) combi(orders[j], sb, 0, 0, course[i]);
            }

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                max = Math.max(max, entry.getValue());
            }

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                if(max >= 2 && entry.getValue() == max) answer.add(entry.getKey());
            }
        }

        Collections.sort(answer);

        return answer;
    }

    public static void combi(String str, StringBuilder sb, int idx, int cnt, int n){
        if(cnt == n){
            map.put(sb.toString(), map.getOrDefault(sb.toString(),0) + 1);
            return;
        }

        for(int i = idx; i<str.length(); i++){
            sb.append(str.charAt(i));
            combi(str,sb,i+1, cnt+1, n);
            sb.delete(cnt, cnt+1);
        }
    }
}
