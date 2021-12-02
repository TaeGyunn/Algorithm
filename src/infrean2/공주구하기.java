package infrean2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<N+1; i++){
            queue.add(i);
        }
        int answer = -1;
        while(!queue.isEmpty()) {

            for (int i = 0; i < K; i++) {
                if (i != K - 1) {
                    int con = queue.poll();
                    if (queue.isEmpty()) {
                        answer = con;
                        break;
                    } else {
                        queue.add(con);
                    }
                } else {
                    queue.poll();
                }
            };
        }
        System.out.println(answer);
    }
}
