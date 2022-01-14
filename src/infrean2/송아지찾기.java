package infrean2;

import java.util.Scanner;

public class 송아지찾기 {

    int[] dis = {1, -1, 5};

    public int solution(int S, int E){
        int cnt = 0;
        while(S != E) {
            if (S > E) {
                S--;
                cnt++;
            } else {
                if (S + dis[2] <= E || S + dis[2] - E < dis[2]/2 ) {
                    S += dis[2];
                    cnt++;
                } else if (S + dis[0] <= E) {
                    S += dis[0];
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();

        송아지찾기 t = new 송아지찾기();
        System.out.println(t.solution(S, E));

    }
}
