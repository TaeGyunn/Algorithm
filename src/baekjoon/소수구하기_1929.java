package baekjoon;

import java.util.Scanner;

public class 소수구하기_1929 {

    static boolean memory[];
    static int M, N;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        N = scan.nextInt();
        memory = new boolean[1000001];
        sosu();

        for(int i=M; i<= N; i++){
            if(!memory[i]) System.out.println(i);
        }

    }

    public static void sosu(){
        memory[0] = true;
        memory[1] = true;
        for(int i=2; i <= Math.sqrt(memory.length); i++){
            if(memory[i]) continue;

            for(int j = i * i; j< memory.length; j+=i){
                memory[j] = true;
            }
        }
    }
}
