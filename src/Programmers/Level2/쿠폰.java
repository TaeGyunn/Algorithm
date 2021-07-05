package Programmers.Level2;

import java.util.Arrays;
import java.util.Collections;

public class 쿠폰 {

    public int solution(int[] prices, int[] discounts){
        int answer = 0;
        Integer[] arr1 = new Integer[prices.length];
        for(int i=0; i<prices.length; i++){
            arr1[i] = prices[i];
        }
        Integer[] arr2 = new Integer[discounts.length];
        for(int j=0; j<discounts.length; j++){
            arr2[j] = discounts[j];
        }
        Arrays.sort(arr1, Collections.reverseOrder());
        Arrays.sort(arr2,Collections.reverseOrder());

        for(int i=0; i< arr2.length; i++) {
           answer += arr1[i] - (arr1[i] * (arr2[i] * 0.01));
        }
        if(prices.length > discounts.length){
            for(int i=arr2.length; i< arr1.length; i++){
                answer += arr1[i];
            }
        }
        return answer;
    }
}
