package book;

import java.util.Scanner;

public class 바닥공사 {

    static int [] arr;


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        arr = new int[10001];
        arr[1] = 1;
        arr[2] = 3;

        for(int i=3; i<=n; i++){
            arr[i] = (arr[i-1] + 2 * arr[i-2]) % 796796;
        }

        System.out.println(arr[n]);
        System.out.println(def(n));
    }

    public static int def(int n){
        if(n == 1) return 1;
        if(n == 2) return 3;

        if(arr[n] != 0){
            return arr[n];
        }

        arr[n] = (def(n-1) +2 * def(n-2)) % 796796;
        return arr[n];
     }
}
