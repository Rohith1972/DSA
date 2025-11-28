/*
    ProblemStatement:
    Given a strong that contains only uppercase alphabets. Remove consecutive duplicate characters 
    in it and return the string. Using two pointer.
    Input:
    "aaabbbvv"
    Output:
    "abv"
*/
import java.util.Scanner;
import java.util.Stack;
public class RemoveConsecDupsStack {
    static String removeDups(String s){
        StringBuffer res = new StringBuffer(s);
        Stack<Character> st = new Stack<>();
        res.reverse();
        char[] ch = res.toString().toCharArray();
        st.push(ch[0]);
        for(int i=1;i<ch.length;i++){
            if(st.peek()!=ch[i]){
                st.push(ch[i]);
            }
        }
        res.setLength(0);
        while(!st.empty()){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = removeDups(s);
        System.out.println(res);
    }
}
