package infrean;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {

    public String solution(String str, String str1){
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        for(char x : str.toCharArray()){
            q.offer(x);
        }

        for(char x : str1.toCharArray()){
            if(q.contains(x)){
                if(x!=q.poll())return "No";
            }
        }
        if(!q.isEmpty()){
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args){

        교육과정설계 T = new 교육과정설계();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = scan.next();

        System.out.println(T.solution(str, str1));
    }
}
