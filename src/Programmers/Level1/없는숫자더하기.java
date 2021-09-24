package Programmers.Level1;

public class 없는숫자더하기 {

    public int solution(int[] numbers){

        int answer = 0;
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = i;
        }

        for(int i=0; i<numbers.length; i++){
            for (int k : arr) {
                if (numbers[i] == k) {
                    answer += k;
                }
            }
        }

        answer = 45 - answer;
        return answer;
    }
}
