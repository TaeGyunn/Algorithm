package infrean2;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        char answer = ' ';
        int N = scan.nextInt();
        String arr = scan.next();
        HashMap<Character, Integer> hash = new HashMap<>();

        for(char x : arr.toCharArray()){
            hash.put(x, hash.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : hash.keySet()){
            if(hash.get(key) > max){
                max = hash.get(key);
                answer = key;
            }
        }
        System.out.println(answer);





    }
}
