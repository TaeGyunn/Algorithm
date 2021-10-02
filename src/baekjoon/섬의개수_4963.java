package baekjoon;

import java.util.Scanner;

public class 섬의개수_4963 {

    static int W, H;
    static int[][] map;
    //                12     3       6      9
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static boolean[][] check;
    static int count;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            W = scan.nextInt(); // 지도의 너비
            H = scan.nextInt(); // 지도의 높이

            // 0 0이 입력되면 종료
            if(W == 0 && H == 0) System.exit(0);

            //지도 2차원 배열 선언
            map = new int[H][W];

            //좌표 방문 체크
            check = new boolean[H][W];

            //지도 2차원 배열 입력
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    map[i][j] = scan.nextInt();
                }
            }
            count = 0;

            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    //Search에 들어가면 count 증가
                    if(map[i][j] == 1 && !check[i][j]){
                        Search(i, j);
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }

    }
    public static void Search(int x, int y){
        check[x][y] = true;
        
        //8방향 확인
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            //범위 안에 있고 배열 값이 1이고 true 라면
            if(nx >= 0 && ny >= 0 && nx < H && ny < W){
                if(map[nx][ny] == 1 && !check[nx][ny]) Search(nx, ny);
            }
        }
    }
}
