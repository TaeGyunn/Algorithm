package infrean;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

    public int solution(int n, int m, int[][] arr, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(int l=0; l<m; l++) {
            boolean run = true;
            for (int i = 0; i < n; i++) {
                if(arr[i][moves[l]-1] != 0 && run){
                    if(!stack.isEmpty()){
                        if(arr[i][moves[l]-1] != stack.peek()) {
                            stack.push(arr[i][moves[l]-1]);
                            arr[i][moves[l]-1] = 0;
                        }
                        else{
                            stack.pop();
                            arr[i][moves[l]-1] = 0;
                            answer += 2;
                        }
                    }
                    else if(stack.isEmpty()){
                        stack.push(arr[i][moves[l]-1]);
                        arr[i][moves[l]-1] = 0;
                    }
                    run = false;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args){

        크레인인형뽑기 T = new 크레인인형뽑기();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int  m = scan.nextInt();    //배열의 길이
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr,moves));
    }
}
