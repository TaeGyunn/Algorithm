package Programmers.Winter;

public class Winter2 {

    public int solution(int time, int gold, int[][] upgrade) {

        int time2 = time;
        int money[] = new int[3];

        //Upgrade 1번만
        while (time2 > 0){
            time2 = time2 - upgrade[0][1];
            money[0] += gold;
            if(time2 < upgrade[0][1]){
                time2 = 0;
            }
        }

        //Updrade 2번만
        time2 = time;
        int up = 0;
        while(time2 > 0){
            if(up == 0) {
                time2 = time2 - upgrade[0][1];
                money[1] += gold;
                if(money[1] >= 1500){
                    money[1] -= 1500;
                    up = 1;
                }
            }else if(up == 1){
                time2 = time2 - upgrade[1][1];
                money[1] += gold;
            }

            if(up == 0){
                if(time2 < upgrade[0][1]){
                    time2 = 0;
                }
            }else if(up == 1){
                if(time2 < upgrade[1][1]){
                    time2 = 0;
                }
            }
        }

        time2 = time;
        up = 0;
        while(time2 > 0){
            if(up == 0) {
                time2 = time2 - upgrade[0][1];
                money[2] += gold;
                if(money[2] >= upgrade[1][0]){
                    money[2] -= upgrade[1][0];
                    up = 1;
                }
            }else if(up == 1){
                time2 = time2 - upgrade[1][1];
                money[2] += gold;
                if(money[2] >= upgrade[2][0]){
                    money[2] -= upgrade[2][0];
                    up = 2;
                }
            }else{
                time2 = time2 - upgrade[2][1];
                money[2] += gold;
            }

            if(up == 0){
                if(time2 < upgrade[0][1]){
                    time2 = 0;
                }
            }else if(up == 1){
                if(time2 < upgrade[1][1]){
                    time2 = 0;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<money.length; i++){
            if(max < money[i]){
                max = money[i];
            }
        }
        return max;
    }
}
