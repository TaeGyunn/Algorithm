package infrean;

import java.util.Scanner;

public class 재귀함수 {

    public void dfs(int n){
        if(n > 1){
            dfs(n-1);
            System.out.print(n+" ");
        }else{
            System.out.print(n+" ");
        }

    }

    public static void main(String[] args){

        재귀함수 T  = new 재귀함수();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        T.dfs(n);
    }
}
