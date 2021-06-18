package infrean;

import java.util.Scanner;

public class 팩토리얼 {
    public int solution(int n ){
        if(n == 1) return 1;
        else return n*solution(n-1);

    }

    public static void main(String[] args){

        팩토리얼 T = new 팩토리얼();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
