package baekjoon;

import java.util.Scanner;

public class 차이를최대로_10819 {

    static int max = 0;
    static int n;
    static int[] arr;
    static int[] newArr;
    static boolean[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        newArr = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bt(0);
        System.out.print(max);
    }
    static void bt(int depth){
        if(depth == n){
            int sum = 0;
            for(int i=0; i<n-1; i++){
                sum += Math.abs(newArr[i+1] - newArr[i]);
            }
            max = Math.max(max,sum);
            return;
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                newArr[depth] = arr[i];
                bt(depth + 1);
                visited[i] = false;
            }
        }
    }

}
