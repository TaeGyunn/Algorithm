package Programmers.Level2;

import java.util.Scanner;

public class 멀쩡한사각형 {

    public long solution(int w, int h){
        long answer = 0;

        for(int i=0; i<w; i++){
            answer += h * i / w;
        }

        return answer * 2;
    }

    public static void main(String[] args){

        멀쩡한사각형 T = new 멀쩡한사각형();
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        System.out.println(T.solution(w,h));

    }
}
