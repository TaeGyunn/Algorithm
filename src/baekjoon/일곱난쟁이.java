package baekjoon;

import java.util.*;

public class 일곱난쟁이 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<9; i++) {
            arr.add(scan.nextInt());
        }

        Collections.sort(arr);

        List<Integer> answer = new ArrayList<>();
        int result = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++ ){
                for(int k = 0; k<arr.size(); k++){
                    if(k != i && k != j){
                        answer.add(arr.get(k));
                        result += arr.get(k);
                    }
                }
                if(result == 100){
                    for (Integer integer : answer) {
                        System.out.println(integer);
                    }
                    System.exit(0);
                }else{
                    result = 0;
                    answer.clear();
                }
            }
        }
        //---------------------------------------------------------------------------//
//        int n =9;
//        int[] arr = new int[n];
//        int sum = 0;
//        for(int i=0; i<n; i++) {
//            arr[i] = scan.nextInt();
//            sum += arr[i];
//        }
//        Arrays.sort(arr);
//
//        for (int i=0; i<n; i++) {
//            for (int j=i+1; j<n; j++) {
//                if (sum - arr[i] - arr[j] == 100) {
//                    for (int k=0; k<n; k++) {
//                        if (i == k || j == k){
//                            continue;
//                        }
//                        System.out.println(arr[k]);
//                    }
//                    System.exit(0);
//                }
//            }
//        }
    }
}
