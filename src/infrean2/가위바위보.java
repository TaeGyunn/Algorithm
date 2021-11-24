package infrean2;

import java.util.Scanner;

public class 가위바위보 {
    // 1:가위, 2:바위, 3:보
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scan.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = scan.nextInt();
        }
        String answer = "";
        for(int i=0; i<N; i++){
            if(A[i] == B[i]) answer += "D";
            else if(A[i]==1 && B[i]==3) answer += "A";
            else if(A[i]==2 && B[i]==1) answer += "A";
            else if(A[i]==3 && B[i]==2) answer += "A";
            else answer += "B";
        }
        System.out.println(answer);
    }
}
