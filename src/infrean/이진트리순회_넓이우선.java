package infrean;

import java.util.LinkedList;
import java.util.Queue;


public class 이진트리순회_넓이우선 {
    Node root;

    public void solution(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) q.add(cur.lt);
                if (cur.rt != null) q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args){

        이진트리순회_넓이우선 T = new 이진트리순회_넓이우선();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.solution(T.root);
    }
}
