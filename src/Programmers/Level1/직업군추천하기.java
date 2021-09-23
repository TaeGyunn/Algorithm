package Programmers.Level1;

 /*
    직업군 언어 점수를 정리한 문자열 배열 table, 개발자가 사용하는 언어를 담은 문자열 배열 languages,
    언어 선호도를 담은 정수 배열 preference가 매개변수로 주어집니다.
    개발자가 사용하는 언어의 언어 선호도 x 직업군 언어 점수의 총합이 가장 높은 직업군을 return 하도록 solution 함수를 완성해주세요.
    총합이 같은 직업군이 여러 개일 경우, 이름이 사전 순으로 가장 빠른 직업군을 return 해주세요.
     */
public class 직업군추천하기 {

    public String solution(String[] table, String[] languages, int[] preference){
        String answer = "";
        int max = 0;

        for(int i=0; i<table.length; i++){
            String arr[] = table[i].split(" ");
            String job = "";
            int sum = 0;

            for(int j=0; j<arr.length; j++){
                int score = arr.length - j;

                if(j == 0){
                    job = arr[j];
                    continue;
                }

                for(int k=0; k<languages.length; k++){
                    if(languages[k].equals(arr[j])){
                        sum += preference[k] * score;
                    }
                }
            }

            if(max <= sum){
                if(max == sum){
                    if(answer.compareTo(job) < 0){
                        continue;
                    }
                }
                max = sum;
                answer = job;
            }
        }
        return answer;
    }
}
