package Programmers.Level2;

public class N개의최소공배수 {

    public int gcd(int a, int b){
        while(b != 0){
            int tmp = a % b;
            a = b;
            b= tmp;
        }
        return a;
    }

    public int lcm(int a, int b){
        return a * b / gcd(a,b);
    }

    public int solution(int[] arr){
        int answer = 0;
        int lcm = arr[0];
        for(int i=0; i<arr.length; i++){
            lcm = lcm(lcm,arr[i]);
        }
        return lcm;
    }

    public static void main(String[] args){

        N개의최소공배수 T = new N개의최소공배수();
        int[] arr = {2,6,8,14};
        System.out.print(T.solution(arr));
    }
}
