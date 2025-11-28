/*
    ProblemStatement:
    Create Stack, store n elements, traverse queue for display using Iterator.
*/
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
class StackTraversalIterator{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            st.add(i);
        }
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}