import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    public LinkedList() {
        this.head = null;
    }
    Node insertBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    Node insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    Node insertMiddle(int data,int p){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            for(int i=1;i<p-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
    Node deleteFirst(){
        if(head == null){
            return null;
        }else{
            head = head.next;
        }
        return head;
    }
    Node deleteLast(){
        if(head == null){
            return null;
        }else if(head.next == null){
            head = null;
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
    Node deleteMiddle(int p){
        if(head == null){
            return null;
        }else if(head.next == null){
            head = null;
        }else{
            Node temp = head;
            for(int i=1;i<p-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
    void traversal(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LinkedListMain{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;
        while(true){
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertBegin(data);
                    break;  
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list.insertMiddle(data, pos);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    list.deleteMiddle(pos);
                    break;
                case 7:
                    list.traversal();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

