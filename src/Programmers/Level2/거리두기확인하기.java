package Programmers.Level2;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class 거리두기확인하기 {

    static int moveX[] = {-1, 0 , 1, 0};
    static int moveY[] = {0, 1, 0, -1};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for(int i=0; i<places.length; i++){
            String tmp[] = places[i];

            boolean isCheck = true;
            for(int r = 0; r < 5 && isCheck; r++){
                for(int c= 0; c<5 && isCheck; c++){
                    if(tmp[r].charAt(c) == 'p'){
                        if(!bfs(r,c,tmp)) isCheck = false;
                    }
                }
            }
            answer[i] = isCheck? 1 : 0;
        }
        return answer;
    }

    public static boolean bfs(int r, int c, String[] places){
        Queue<Point> queue = new LinkedList<Point>();

        queue.add(new Point(r, c));

        while(!queue.isEmpty()){
            Point p = queue.poll();

            for(int d = 0; d<4; d++){
                int nextRow = p.x + moveY[d];
                int nextCol = p.y + moveX[d];

                if(nextCol<0 || nextRow<0 || nextCol>=5 || nextRow>=5 || (nextCol == c && nextRow == r))
                    continue;

                int dist = Math.abs(nextCol - c) + Math.abs(nextRow - r);

                if(places[nextRow].charAt(nextCol) == 'P' && dist <= 2)
                    return false;
                else if(places[nextRow].charAt(nextCol) == 'O' && dist < 2)
                    queue.offer(new Point(nextRow, nextCol));
            }
        }
        return true;
    }
}
