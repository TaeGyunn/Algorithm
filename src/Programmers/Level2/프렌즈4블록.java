package Programmers.Level2;

public class 프렌즈4블록 {

    // 2q * 2 형태로 4개가 붙어있는 경우 사라지면서 점수를 얻는 게임
    // 높이 m, 폭 n, 판의 배치 정보 board
    public int solution(int m, int n, String[] board) {
        int answer = 0;                 // 정답
        char[][] map = new char[m][n];  // map 선언

        for(int i=0; i<m; i++){
            map[i] = board[i].toCharArray();    // map
        }
        return answer;
    }
    
    // 블록 내리기
    private void dropBlock(int m , int n, char[][] map){
        for(int c = 0; c < n; c++){
            for(int r = m -1; r >= 0; r--){
                if(map[r][c] == '.'){
                    for(int nr = r-1; nr >=0; --nr){
                        if(map[nr][c] != '.'){
                            map[r][c] = map[nr][c];
                            map[nr][c] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    // 블록 체크
    private int checkBlock(int m, int n, char[][] map){
        int cnt = 0;
        boolean[][] isChecked = new boolean[m][n];

        for(int i=0; i<m -1; i++){
            for(int j = 0; j< n -1; j++){
                if(map[i][j] == '.') continue;
                checkFour(map, isChecked, i , j);
            }
        }
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(isChecked[i][j]){
                    cnt++;
                    map[i][j] = '.';
                }
            }
        }
        return cnt;
    }

    private void checkFour(char[][] map, boolean[][] isChecked, int i, int j){
        char block = map[i][j];

        for(int r = i; i<i+2; r++){
            for(int c = j; c<j; c++){
                if(map[r][c] != block) return;
            }
        }
        for(int r=i; i<i +2; r++){
            for(int c = j; c<j+2; ++c){
                isChecked[r][c] = true;
            }
        }
    }
}
