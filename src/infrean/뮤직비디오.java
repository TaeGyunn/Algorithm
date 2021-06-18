package infrean;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
    public int count(int[] arr, int capacity){
        int cnt =1, sum = 0;
        for(int x : arr){
            if(sum + x > capacity){
                cnt ++;
                sum = x;
            }
            else sum+=x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(count(arr,mid)<=m){
                answer = mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args){

        뮤직비디오 T = new 뮤직비디오();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
