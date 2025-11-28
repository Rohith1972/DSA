/*
    ProblemStatement:
    Given a String s , Reverse and return the reversed String.
*/
import java.util.Scanner;
public class StringReverse {
    static String solution(String s){
        char ch[] = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = solution(s);
        System.out.println(res);
    }
}
