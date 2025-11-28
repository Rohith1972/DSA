/*
    You are given a String and String contains only English
    alphabet both uppercase and lowercase are considered as 
    same.Now verify Whether String is Isogram or not.
    Isogram : A string is called Isogram if and only if  every
    Character in the String should be unique. - Using HashSet.
*/
import java.util.HashSet;
import java.util.Scanner;
public class Isogram1 {
    static boolean isogram(String s1){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hs.add(ch);
        }
        return hs.size()==s1.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        boolean res = isogram(s1);
        System.out.println(res);
    }
}
