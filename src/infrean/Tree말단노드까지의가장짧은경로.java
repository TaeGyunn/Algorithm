package infrean;

public class Tree말단노드까지의가장짧은경로 {

    Node root;
    public int solution(int L, Node root){
        if(root.lt == null && root.rt == null){return L;}
        else{
            return Math.min(solution(L+1, root.lt), solution(L+1,root.rt));
        }
    }

    public static void main(String[] args){

        Tree말단노드까지의가장짧은경로 T = new Tree말단노드까지의가장짧은경로();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        System.out.println(T.solution(0, T.root));
    }
}
