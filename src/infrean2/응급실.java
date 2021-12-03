package infrean2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {

    class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id=id;
            this.priority=priority;
        }
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0 ;
        Queue<Person> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.offer(new Person(i, arr[i]));
        }
        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority > tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer ++;
                if(tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }



    }
}
