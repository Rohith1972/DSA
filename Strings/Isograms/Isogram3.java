/*
    You are given a String and String contains only English
    alphabet both uppercase and lowercase are considered as 
    same.Now verify Whether String is Isogram or not.
    Isogram : A string is called Isogram if and only if  every
    Character in the String should be unique. - Using Frequency Array.
*/
import java.util.Scanner;
public class Isogram3 {
    static boolean isogram(String s1){
        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            int ch = s1.charAt(i)-'a';
            freq[ch]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1)
                return false;
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
