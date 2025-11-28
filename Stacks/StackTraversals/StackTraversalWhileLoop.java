/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display whileLoop.
*/
import java.util.Scanner;
import java.util.Stack;
public class StackTraversalWhileLoop {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            st.add(i);
        }
        int i = st.size();
        while(i>0){
            System.out.println(st.peek());
            st.pop();
            i--;
        }
    }
        
}
