package infrean;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

    public int solution(int n, int k ){
        int answer = 0;
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<n+1; i++){
            q.add(i);
        }
        boolean run = true;
        while(run){
            if(cnt == 2){
                q.remove();
                cnt = 0;
            }else{
                int num = q.poll();
                q.add(num);
                cnt++;
            }

            if(q.size() == 1) run = false;
        }
        answer = q.poll();
        return answer;
    }

    public static void main(String[] args){

        공주구하기 T = new 공주구하기();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(T.solution(n,k));
    }
}
