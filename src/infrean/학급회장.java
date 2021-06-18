package infrean;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public char solution(int n, String str){
        char answer =' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max =Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        학급회장 T = new 학급회장();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(T.solution(n, str));
    }
}
