package infrean2;

import java.util.Scanner;

public class 유효한팰린드름 {

    public void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();

        A.toLowerCase();

        new StringBuilder(A).reverse().toString();
    }
}
