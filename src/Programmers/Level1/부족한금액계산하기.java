package Programmers.Level1;

public class 부족한금액계산하기 {
    /*
    놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
    처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
    놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
     */
    public long solution(int price, int money, int count) {
        long answer = 0;
        long first = price;

        for(int i=0; i<count; i++){
            answer += price;
            price += first;
        }
        answer = answer - money;
        if(answer < 0){
            answer = 0;
        }

        return answer;
    }
}
