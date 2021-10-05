package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 영역구하기_2583 {

    static int M, N ,K;

    static int[] dr = {-1, 1, 0, 0};    //상하좌우
    static int[] dc = {0, 0, -1, 1};

    static int map[][];

    static int count = 0;
    static ArrayList<Integer> List;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        N = scan.nextInt();
        K = scan.nextInt();

        map  = new int[M][N];

        for(int i=0; i<K; i++){
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            for(int a= y1; a<y2; a++){
                for(int b = x1; b<x2; b++){
                    map[a][b] = 1;
                }
            }
        }

        List = new ArrayList<Integer>();

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 0){
                    count = 0;
                    DFS(i , j);
                    List.add(count);
                }
            }
        }
        System.out.println(List.size());

        Collections.sort(List);

        for(Integer c : List) System.out.println(c + " ");
    }

    public static void DFS(int r, int c){
        map[r][c] = 1;
        count ++;

        for(int i=0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nc >= 0 && nr < M && nc < N){
                if(map[nr][nc] == 0) DFS(nr,nc);
            }
        }
    }
}
