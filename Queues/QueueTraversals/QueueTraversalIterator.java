/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display using Iterator.
*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class QueueTraversal1{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}