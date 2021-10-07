package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 모든순열_10974 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList picked = new ArrayList<Integer>();
        boolean[] check = new boolean[N+1];

        dfs(N, picked, check);
    }

    public static void dfs(int n, ArrayList picked, boolean[] check){
        if(picked.size() == n){
            printAnswer(picked);
            return;
        }
        for(int i=1; i<=n; i++){
            if(check[i]) continue;
            check[i] = true;
            picked.add(i);
            dfs(n, picked, check);
            picked.remove(picked.size()-1);
            check[i] = false;
        }
    }

    public static void printAnswer(ArrayList picked){
        for(int i=1; i<picked.size(); i++){
            System.out.print(picked.get(i) + " ");
        }
        System.out.println();
    }

}
