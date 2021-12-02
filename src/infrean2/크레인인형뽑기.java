package infrean2;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = scan.nextInt();
            }
        }
        int M = scan.nextInt();
        int[] moves =  new int[M];
        for(int i=0; i<moves.length; i++){
            moves[i] = scan.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(map[j][moves[i]-1] != 0 ){
                    if(!stack.empty() && stack.peek() == map[j][moves[i]-1]){
                        stack.pop();
                        answer += 2;
                    }else {
                        stack.push(map[j][moves[i]-1]);
                    }
                    map[j][moves[i]-1] = 0;
                    break;

                }
            }
        }
        System.out.println(answer);


    }
}
