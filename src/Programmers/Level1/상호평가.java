package Programmers.Level1;

public class 상호평가 {

    public String solution(int[][] scores){
        String answer = "";
        int n = scores.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            double avg = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int j=0; j<n; j++){
                if(i == j) continue;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
                sum += scores[j][i];
            }

            if(scores[i][i] > max || scores[i][i] < min){
                avg = (double) sum / (n - 1);
            }else{
                avg = (double) (sum + scores[i][i]) / n;
            }

            if(avg >= 90){
                answer += "A";
            }else if(avg >= 80){
                answer += "B";
            }else if(avg >= 70){
                answer += "C";
            }else if(avg >= 50){
                answer += "D";
            }else{
                answer += "F";
            }
        }
        return answer;
    }
}
