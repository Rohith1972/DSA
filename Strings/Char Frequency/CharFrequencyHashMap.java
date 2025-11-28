/*
    Problem Statement:
    Given a string that consists of only English alphabets and both uppercase and lowercase are 
    considered the same. Find the frequency of each character in the string.  
    Using Built-in HashMap.
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
class CharFrequencyHashMap{
    static void freqCount(String s1){
        String s = s1.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        Set<Character> st = hm.keySet();
        for(Character ch : st){
            System.out.println(ch+" : "+hm.get(ch));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        freqCount(s);
    }
}