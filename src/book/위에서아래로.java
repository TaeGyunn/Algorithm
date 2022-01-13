package book;

import java.util.*;

public class 위에서아래로 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        List<int[]> list = Arrays.asList(arr);
        Collections.reverse(list);
    }
}
