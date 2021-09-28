package Programmers.Level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
            if(sizes[i][0] > width){
                width = sizes[i][0];
            }
            if(sizes[i][1] > height){
                height = sizes[i][1];
            }
        }
        answer = width * height;

        return answer;
    }
}
