package Programmers.Level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 구명보트 {
    public int solution(int[] people, int limit) {

        List<Integer> list = new ArrayList<>();
        for(int x : people) list.add(x);
        Collections.sort(list);

        ArrayDeque<Integer> dq = new ArrayDeque<>(50001);
        for(int x : list) dq.add(x);

        int ans = 0;
        while(dq.isEmpty() == false) {
            int weight = dq.pollLast();
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            ans++;
        }

        return ans;
    }

}
