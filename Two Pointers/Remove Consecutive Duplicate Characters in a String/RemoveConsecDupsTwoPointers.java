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
public class RemoveConsecDupsTwoPointers {
    static String removeDups(String s){
        char[] ch = s.toCharArray();
        int n = s.length();
        int i=0,j=1;
        StringBuffer res = new StringBuffer();
        while(i<n && j<n){
            if(ch[j]==ch[i]){
                j++;
                continue;
            }else{
                res.append(ch[i]);
                i=j;
                j++;
            }
        }
        res.append(ch[i]);
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = removeDups(s);
        System.out.println(res);
    }
}
