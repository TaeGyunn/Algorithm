package baekjoon;

import java.util.Scanner;

public class 터렛_1002 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int r1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int r2 = scan.nextInt();

            System.out.println(point(x1, y1, r1, x2, y2, r2));

        }
    }

    public static int point(int x1, int y1, int r1, int x2, int y2, int r2){
        
        // 두 점 사이의 거리
        int distance = (int)((Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));

        // 무한
        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;

        // 다른 원은 외부
        else if(distance > Math.pow(r1 + r2, 2)) return 0;

        // 동심원
        else if(distance < Math.pow(r2 - r1, 2)) return 0;

        // 두 원이 외접
        else if(distance == Math.pow(r1 + r2, 2)) return 1;

        // 두 원이 내접
        else if(distance == Math.pow(r2 - r1, 2)) return 1;
        
        // 그 외
        else return 2;


    }
}
