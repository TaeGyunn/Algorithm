package infrean2;

import java.util.Arrays;
import java.util.Scanner;


public class 뮤직비디오 {

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //배열중 최대값 
        int rt = Arrays.stream(arr).sum();  //배열 총합
        while(lt < rt){
            int mid = (lt + rt)/2;
            if(count(arr, mid)<=m){
                answer = mid;
                rt = mid-1;
            }
            else lt = mid+1;
        }
        return answer;
    }
    public int count(int[] arr, int capacity){
        int cnt =1, sum = 0;
        for(int x : arr){
            if(sum + x > capacity){
                cnt++;
                sum =x;
            }
            else sum += x;
        }
        return cnt;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = scan.nextInt();
    }
}
