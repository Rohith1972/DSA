/*
    You are given a String and String contains only English
    alphabet both uppercase and lowercase are considered as 
    same.Now verify Whether String is Isogram or not.
    Isogram : A string is called Isogram if and only if  every
    Character in the String should be unique. - Using Boolean Array.
*/
import java.util.Scanner;
public class Isogram4 {
    static boolean isogram(String s1){
        boolean[] res = new boolean[26];
        for(int i=0;i<s1.length();i++){
            int ch = s1.charAt(i)-'a';
            if(res[ch])
                return false;
            if(!res[ch])
                res[ch]=true;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        boolean res = isogram(s1);
        System.out.println(res);
    }
}
