package book;

import java.awt.*;
import java.util.Scanner;


public class 상하좌우 {

    public static void main(String[] args){

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] move = {"L", "R", "U", "D"};

        Point point = new Point();
        point.x = 1;
        point.y = 1;

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String[] arr = new String[N+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.next();
        }

        for(int i=0; i<N+1; i++){
            for(int j=0; j<move.length; j++){
                if(arr[i].equals(move[j])){
                    int x = point.x + dx[j];
                    int y = point.y + dy[j];

                    if(x < 1 || y < 1 || x > N || y > N ) continue;

                    point.x = x;
                    point.y = y;
                }
            }
        }

        System.out.println(point);
    }
}
