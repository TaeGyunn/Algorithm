package baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 크리스마스선물_14235 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n =scan.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());

        for(int i=0; i<n; i++){

            int a = scan.nextInt();
            if(a > 0){
                for(int j =0; j<a; j++){
                    queue.add(scan.nextInt());
                }
                continue;
            }
            if(a == 0 && !queue.isEmpty()){
                System.out.println(queue.poll());
            }else{
                System.out.println("-1");
            }
        }
    }
}
