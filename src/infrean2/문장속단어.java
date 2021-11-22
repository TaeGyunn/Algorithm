package infrean2;

import java.util.Scanner;

public class 문장속단어 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String[] arr = A.split(" ");

        String answer = "";
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i].length()){
                max = arr[i].length();
                answer = arr[i];
            }
        }
        System.out.println(answer);
    }
}
