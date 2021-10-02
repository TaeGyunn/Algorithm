package Programmers.Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 송전탑_han {
    public static Node[] s_top;

    public static class Node{
        int v;  // 노드
        ArrayList<Node> al; // node 집합

        Node(int v){
            this.v = v;
            al = new ArrayList<>();
        }
    }

    public static void main(String[] args){
        int n = 9;
        int[][] map = {{1,3}, {2,3}, {3,4}, {4,5}, {4,6}, {4,7},{7,8},{7,9}};

    //    int n = 4;
    //    int[][] map = {{1,2}, {2,3}, {3,4}};

    //    int n = 7;
    //    int[][] map = {{1,2}, {2,7}, {3,7}, {3,4}, {4,5},{6,7}};

        int answer = Integer.MAX_VALUE;

        int map_row = map.length;

        s_top = new Node[n+1];  //0을 제외하기 위해서 1추가
        
        // s_top 배열 초기화
        for(int i=1; i<=n; i++){
            s_top[i] = new Node(i);
        }

        // 노드 간 연결
        for(int i=0; i<map_row; i++){
            s_top[map[i][0]].al.add(s_top[map[i][1]]);
            s_top[map[i][1]].al.add(s_top[map[i][0]]);
        }

        //작업
        for(int i=0; i<map_row; i++){
            int cut_st = map[i][0];
            int cut_ed = map[i][1];

            boolean[] visited = new boolean[n+1];

            int a = isMapping(cut_st, cut_ed, visited);
            int b= isMapping(cut_ed, cut_st, visited);
            int tmp = Math.abs(a-b);

            if(answer > tmp) answer = tmp;

        }
        System.out.println(answer);
    }

    public static int isMapping(int st, int not_in, boolean[] visit){
        Queue<Node> q = new LinkedList<>();
        q.add(s_top[st]);

        int max = 1;

        while(!q.isEmpty()){
            Node curNode = q.poll();
            visit[curNode.v] = true;

            for(Node ad : curNode.al){
                if(ad.v == not_in || visit[ad.v]) continue;

                visit[ad.v] = true;
                max ++;
                q.add(ad);
            }
        }
        return max;
    }

}
