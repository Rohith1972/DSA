/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display using Stream API.
*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueTraversal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        q.stream().forEach(x->System.out.println(x));
    }
}
