package baekjoon;

import java.util.Scanner;

public class 바이러스_2606 {

    static int cnt = 0;

    static void DFS(int[][] map, boolean[] check, int v){
        if(check[v] == true) return;

        check[v] = true;
        cnt ++;

        for(int i=0; i<map[v].length; i++){
            if(map[v][i] == 1 && !check[i])
                DFS(map, check, i);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int e = scan.nextInt();

        int map[][] = new int[n+1][n+1];
        boolean check[] = new boolean[n+1];

        for(int i=0; i<e; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();

            map[v1][v2] = 1;
            map[v2][v1] = 1;
        }

        DFS(map, check, 1);

        System.out.println(cnt - 1);
    }
}
