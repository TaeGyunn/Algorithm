package infrean;

class Node{
    int data;
    Node lt, rt;
    Node(int val){
        data = val;
        lt = rt =null;
    }
}

public class 이진트리순회 {

    Node root;
    public void solution(Node root){
        if(root == null) return;
        else{
            System.out.print(root.data +" ");
            solution(root.lt);
            solution(root.rt);
        }
    }
    public static void main(String[] args){
        이진트리순회 T = new 이진트리순회();
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
