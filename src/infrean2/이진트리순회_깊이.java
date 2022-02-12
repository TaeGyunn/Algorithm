package infrean2;

class Node{
    int data;
    Node x, y;

    public Node(int val){
        data = val;
        x = y = null;
    }
}

public class 이진트리순회_깊이 {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else{
            DFS(root.x);
            System.out.println(root.data+" ");
            DFS(root.y);
        }
    }

}
