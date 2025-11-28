/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display using ListIterator.
*/
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
public class StackTraversalListIterator {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            st.add(i);
        }
        ListIterator<Integer> it = st.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
