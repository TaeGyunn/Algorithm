package baekjoon;

public class 셀프넘버_4673 {

    public static void main(String[] args){

        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; i++){

            int n = plus(i);
            if(n < 10001) check[n] = true;
        }

        for(int i= 1; i< 10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }


    }

    public static int plus(int n){

        int sum = n;

        while(n != 0){
            sum = sum + (n % 10);
            n = n/10;
        }

        return sum;

    }
}
