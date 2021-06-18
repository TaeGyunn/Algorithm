package Programmers.Level2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 더맵게 {

    public int solution(ArrayList<Integer> scoville, int k){
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int x : scoville){
            heap.offer(x);
        }

        while(heap.peek() <= k){
            if(heap.size() == 1){
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b * 2);

            heap.offer(result);
            answer ++;
        }

        return answer;
    }

    public static void main(String[] args){
        더맵게 T = new 더맵게();

        ArrayList<Integer> scoville = new ArrayList<>();
        int k = 7;
        scoville.add(1);
        scoville.add(2);
        scoville.add(3);
        scoville.add(9);
        scoville.add(10);
        scoville.add(12);


        System.out.println(T.solution(scoville,k));

    }
}
