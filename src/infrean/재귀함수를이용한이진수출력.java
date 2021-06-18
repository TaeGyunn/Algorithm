package infrean;

import java.util.Scanner;

public class 재귀함수를이용한이진수출력 {

    public void solution(int n){
        if(n > 1){
            solution(n/2);
            System.out.print(n%2);
        }else{
            System.out.print(n%2);
        }

    }

    public static void main(String[] args){

        재귀함수를이용한이진수출력 T = new 재귀함수를이용한이진수출력();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        T.solution(n);
    }
}
