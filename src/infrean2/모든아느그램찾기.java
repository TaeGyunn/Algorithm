package infrean2;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아느그램찾기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();

        int answer = 0;
        HashMap<Character, Integer> hashMapA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMapB = new HashMap<Character, Integer>();
        for(char x : B.toCharArray()){
            hashMapB.put(x, hashMapB.getOrDefault(x, 0)+1);
        }
        for(int lt=0; lt<A.length()-2; lt++){
            for(int rt=lt; rt < lt + B.length(); rt++) {
                hashMapA.put(A.charAt(rt), hashMapA.getOrDefault(A.charAt(rt), 0) + 1);
            }
            if(hashMapA.equals(hashMapB)){
                answer++;
            }
            hashMapA.clear();;
        }
        System.out.println(answer);
    }
}
