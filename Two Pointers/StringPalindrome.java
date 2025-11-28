/*
    ProblemStatement: 
    Given a String , Chack whether the given String is Palindrome or not.
*/
import java.util.Scanner;
class StringPalindrome{
    static boolean solution(String s){
        char[] ch = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean res = solution(s);
        System.out.println(res);
    }
}