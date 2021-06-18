package infrean;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {
    static int[] arr;
    int[] dis = {1,-1,5};
    Queue<Integer> q = new LinkedList<>();
    public int solution(int n, int e){
        arr = new int[10001];
        arr[n] = 1;
        q.offer(n);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int x = q.poll();
                for(int j=0; j<3; j++){
                    int nx = x+ dis[j];
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && arr[nx] == 0){
                        arr[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return  0;
    }


    public static void main(String[] args){
        송아지찾기 T = new 송아지찾기();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(T.solution(n, e));
    }
}
