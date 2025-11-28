/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display using foreach loop.
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueTraversal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc .nextInt();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        for(Integer i : q){
            System.out.println(i);
        }
    }
}
