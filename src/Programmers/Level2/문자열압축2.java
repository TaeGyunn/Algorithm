package Programmers.Level2;

public class 문자열압축2 {

    class Solution {
        public int solution(String s) {

            int min = s.length();

            for(int i = 1; i<= s.length() / 2; i++){
                int compLeng = compression(s, i).length();
                min = Math.min(min, compLeng);
            }
            return min;
        }

        private String compression(String str, int i){

            int count = 1;  // 압축 여보 
            String compression = "";
            String pattern = "";

            for(int j=0; j<= str.length() + i; j += i){
                String nowStr;

                //전 문자열과 비교할 현재 문자열
                if( j >= str.length()){
                    nowStr = "";
                }else if(str.length() < j + i) { //현재 문자열이 마지막 문자열
                    nowStr = str.substring(j);
                }else{
                    nowStr = str.substring(j, j + i);
                }

                // 1. 전 문자열이랑 똑같은지 비교한다. (맨 처음이면 비교 x)
                if( j != 0){
                    if(nowStr.equals(pattern)){ // 똑같으면
                        count++;
                    }else if(count >= 2){   // 다르고 count가 2회 이상이면 압축 가능
                        compression += count + pattern;
                        count = 1;
                    }else{
                        compression += pattern;
                    }
                }
                pattern = nowStr;   //현재 문자열을 전 문자 열로 바꿔준다
            }
            return compression;
        }
    }
}
