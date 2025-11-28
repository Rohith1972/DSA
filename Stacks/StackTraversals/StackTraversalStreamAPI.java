/*
    ProblemStatement:
    Create Queue, store n elements, traverse queue for display using Stream API.
*/
import java.util.Scanner;
import java.util.Stack;
public class StackTraversalStreamAPI {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            st.add(i);
        }
        st.stream().forEach((x)->System.out.println(x));
    }
}
