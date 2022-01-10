package book;

import java.util.Scanner;

public class 시각 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int result = 0;

        for(int h=0; h<=N; h++){
            for(int m = 0; m<60; m++){
                for(int s = 0; s<60; s++){

                    String time = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
                    if(time.indexOf('3') != -1){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
