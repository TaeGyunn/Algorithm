package infrean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args){
        장난꾸러기 T = new 장난꾸러기();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }
}
