package infrean;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
    public int count(int[] arr, int dist){
        int cnt =1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr,mid) >= c){
                answer = mid;
                lt = mid+1;
            }
            else rt = mid-1;
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(); //마구간의 갯수
        int c = scan.nextInt(); //말 수
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = scan.nextInt();
        }
    }
}
