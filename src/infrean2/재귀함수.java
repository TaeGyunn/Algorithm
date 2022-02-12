package infrean2;

import java.util.Scanner;

public class 재귀함수 {

    public void print(int n){
        if(n == 1){
            System.out.print("1");
        }else{
            System.out.println(n);
            print(n-1);
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
    }
}
