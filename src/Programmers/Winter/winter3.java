package Programmers.Winter;

public class winter3 {

    public static int solution(String[] drum) {
        int answer = 0;

        Character[][] map = new Character[drum.length][drum.length];

        for(int i=0; i<drum.length; i++){
            for(int j=0; j<drum.length; j++){
                map[i][j] = drum[i].charAt(j);
            }
        }

        for(int i=0; i<drum.length; i++){
            int check = 0;
            boolean run = true;
            int x=i ,y = 0;
            while(run){
                if(map[y][x] == '#'){
                    y++;
                    if(y == drum.length-1) run = false;
                }else if(map[y][x] == '>'){
                    x++;
                }else if(map[y][x] == '<'){
                    x--;
                }else{
                    check++;
                    if(check == 2){
                        run = false;
                    }else if(check == 1){
                        y++;
                        if(y == drum.length-1) run = false;
                    }
                }
            }
            if(y == drum.length-1){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        String[] drum = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
       System.out.println(solution(drum));
    }
}
