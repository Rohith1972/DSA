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
    int height(){
        return heightRec(root);
    }
    int heightRec(Node root){
        if(root == null)
            return 0;
        else{
            return 1+Math.max(heightRec(root.left),heightRec(root.right));
        }
    }
}
class HeightRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            bst.insert(sc.nextInt());
        }
        System.out.println(bst.height());
    }
}