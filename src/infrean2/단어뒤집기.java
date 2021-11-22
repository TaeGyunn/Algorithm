package infrean2;

import java.util.Scanner;

public class 단어뒤집기 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.next();
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(new StringBuilder(arr[i]).reverse().toString());
        }
    }
}
