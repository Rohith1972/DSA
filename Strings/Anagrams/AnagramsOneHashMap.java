/*
    ProblemStatement:
    Given two strings that consists only English alphabets. Here both lower case and upper case are
    considered the same. Now verify whether two strings are anagrams are not- using One HashMap.
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class AnagramsOneHashMap{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean res = areAnagrams(s1,s2);
        System.out.println(res);
    }
    static boolean areAnagrams(String s1,String s2){
        HashMap<Character,Integer> hm1 = new HashMap<>();
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char[] ch1 = s3.toCharArray();
        char[] ch2 = s4.toCharArray();
        for(int i=0;i<ch1.length;i++){
            if(!hm1.containsKey(ch1[i]))
                hm1.put(ch1[i],1);
            else
                hm1.put(ch1[i],hm1.get(ch1[i])+1);
        }
        for(int i=0;i<ch1.length;i++){
            hm1.put(ch2[i],hm1.get(ch2[i])-1);
        }
        Set<Character> st = hm1.keySet(); 
        for(Character i : st){
            if(!(hm1.get(i)==0))
                return false;
        }
        return true;
    }
}
