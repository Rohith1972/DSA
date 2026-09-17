import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinarySearchTree{
    Node root;
    public BinarySearchTree(){
        this.root = null;
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }else{
            Node curr = root;
            Node par = null;
            while(curr != null){
                par = curr;
                if(data < curr.data){
                    curr = curr.left;
                }else{
                    curr = curr.right;
                }
            }
            if(data < par.data){
                par.left = newNode;
            }else{
                par.right = newNode;
            }
        }
    }
    int width(int k){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 1;
        while(!q.isEmpty()){
            int size = q.size();
            if(height == k)
                return size;
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            height++;
        }
        return -1;
    }
}
class WidthSpecificLevel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            bst.insert(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(bst.width(k));
    }
}