package Programmers.Level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class 프린터 {

    class num{
        int priorities;
        int location;
        public num(int priorities, int location){
            this.priorities = priorities;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;     //최종 location

        Deque<num> que = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            que.add(new num( priorities[i],i));
        }

        int count = 0;
        while(!que.isEmpty()){
            num doc = que.poll();

            boolean check = true;
            for(num n : que){
                if(n.priorities > doc.priorities){
                    check = false;
                }
            }
            if(check){
                count++;
                if(doc.location == location) {
                    answer = count;
                    break;
                }
            }else{
                que.add(doc);
            }
        }
        return answer;
    }
}
