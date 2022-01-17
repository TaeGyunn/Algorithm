package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 최소힙_1927 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();  // 연산의 개수

        PriorityQueue<Integer> q = new PriorityQueue();

        for(int i=0; i<N; i++){
            int x = scan.nextInt();
            
            if(x > 0){
                q.add(x);
            }else if(!q.isEmpty() && x == 0){
                System.out.println(q.poll());
            }else{
                System.out.println(0);
            }
        }

    }
}
