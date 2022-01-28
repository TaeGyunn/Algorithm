package Programmers.Winter;


public class winter5 {

    public static int solution(int n, String[] recipes, String[] orders){

        int[] answer = new int[n];
        int[] fire = new int[n];
        int[] count = new int[n];
        int check = 0;
        boolean run = true;

        while(run){
            for(int i=0; i<n; i++){
                if(fire[i] == 0){
                    count[i]++;
                    for(int j=0; j<recipes.length; j++){
                        if(recipes[j].charAt(0) == orders[i].charAt(0)){
                            fire[i] = recipes[j].charAt(1);
                        }
                    }
                }else if(fire[i] != 0){
                    count[i]++;
                    for(int j=0; j<recipes.length; j++){
                        if(recipes[j].charAt(0) == orders[i].charAt(0)){
                            if(count[i] == recipes[j].charAt(1)-48){
                                fire[i] = 0;
                                answer[i] +=  recipes[j].charAt(1)-48;
                                count[i] = 0;
                                check ++;
                                if(check == orders.length){
                                    run = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        int max = 0;
        for(int i=0; i<answer.length; i++){
            if(max < answer[i]){
                max = answer[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int n = 2;
        String[] recipes = {"A5", "B7"};
        String[] orders = {"A1", "B2", "A3", "B4"};

        System.out.println(solution(n, recipes, orders));

    }
}
