package infrean2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();

        String answer="YES";
        Queue<Character> Q=new LinkedList<>();
        for(char x : A.toCharArray()) Q.offer(x);
        for(char x : B.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) answer = "NO";
            }
        }
        if(!Q.isEmpty()) answer= "NO";
        System.out.println(answer);
    }
}
