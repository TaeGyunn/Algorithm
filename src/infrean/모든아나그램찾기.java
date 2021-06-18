package infrean;

import java.util.HashMap;
import java.util.Scanner;

public class 모든아나그램찾기 {

    public int solution(String S, String T){
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : T.toCharArray()){
            map2.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i=0; i<T.length()-1; i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i),0)+1);
        }
        int lt =0;
        for(int rt = T.length()-1; rt<S.length(); rt++){
            map.put(S.charAt(rt), map.getOrDefault(S.charAt(rt),0)+1);
            if(map.equals(map2)){
                answer++;
            }
            map.put(S.charAt(lt), map.get(S.charAt(lt))-1);
            if(map.get(S.charAt(lt)) == 0) map.remove(S.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
       모든아나그램찾기 C = new 모든아나그램찾기();
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        System.out.println(C.solution(S,T));

    }
}
