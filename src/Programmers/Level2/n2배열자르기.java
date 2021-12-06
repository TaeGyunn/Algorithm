package Programmers.Level2;

import java.util.ArrayList;
import java.util.List;

public class n2배열자르기 {

        public static List<Long> solution(int n, long left, long right) {
            List<Long> list = new ArrayList<>();

            for(long i = left; i<right+1; i++){
                list.add(Math.max(i/n, i%n) + 1);
            }

            return list;
        }

        public static void main(String[] args){
            int n =3;
            long left = 2;
            long right = 5;
            for(Long x :solution(n, left, right)){
                System.out.print(x + " ");
            }
        }

}
