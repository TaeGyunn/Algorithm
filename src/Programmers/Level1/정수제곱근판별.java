package Programmers.Level1;

public class 정수제곱근판별 {

    public long solution(long n ){
        Double num = Math.sqrt(n);
        if(num == num.intValue()){
            return (long)Math.pow(num +1, 2);
        }else return -1;
    }
    public static void main(String[] args){
        double num = Math.sqrt(3);
        System.out.println(num);
    }
}
