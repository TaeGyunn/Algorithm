package Programmers.Level1;

public class 비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            answer[i] = String.format("%" + n +"s", Integer.toBinaryString(arr1[i] | arr2[i]))
                    .replace('1','#').replace('0',' ');
        }

        return answer;
    }

    public static void main(String[] args){
        비밀지도 T = new 비밀지도();
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        int n =5;
        for(String x : T.solution(n,arr1, arr2)){
            System.out.println(x);
        }
    }
}
