/*
    Count of no of buildings facing sun- 2 methods 
    Using Stack DataStructure.
*/
import java.util.Scanner;
import java.util.Stack;
class BuildingsCountStack{
    static int count(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=0;i<n;i++){
            if(arr[i]>st.peek()){
                st.push(arr[i]);
            }
        }
        return st.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = count(arr,n);
        System.out.println(res);
    }
}
