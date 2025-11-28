/*
    You are given a String and String contains only English
    alphabet both uppercase and lowercase are considered as 
    same.Now verify Whether String is Isogram or not.
    Isogram : A string is called Isogram if and only if  every
    Character in the String should be unique. - Using HashMap.
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Isogram2 {
    static boolean isogram(String s1){
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        Set<Character> st = hs.keySet();
        for(Character i : st){
            if(hs.get(i)!=1)
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
