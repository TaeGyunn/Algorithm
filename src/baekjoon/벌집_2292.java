package baekjoon;

import java.util.Scanner;

public class 벌집_2292 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int count = 1, range = 2;

        if (N == 1) {
            System.out.print(count);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
