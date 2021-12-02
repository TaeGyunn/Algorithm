package infrean2;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.next();
        String B = scan.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        String answer = "YES";
        for(char x : A.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x, 0)+1);
        }
        for(char x : B.toCharArray()){
            if(!hashMap.containsKey(x) || hashMap.get(x) == 0) answer = "No";
            hashMap.put(x, hashMap.get(x)-1);
        }
        System.out.println(answer);
    }
}
