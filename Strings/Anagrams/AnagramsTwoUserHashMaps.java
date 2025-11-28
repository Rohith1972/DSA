/*
    ProblemStatement:
    Given two strings that consists only English alphabets. Here both lower case and upper case are
    considered the same. Now verify whether two strings are anagrams are not- using Two user defined
    HashMaps.
*/
import java.util.Arrays;
import java.util.Scanner;
public class AnagramsTwoUserHashMaps{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean res = areAnagrams(s1,s2);
        System.out.println(res);
    }
    static boolean areAnagrams(String s1,String s2){
        if(!(s1.length()==s2.length()))
            return false;
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char[] ch1 = s3.toCharArray();
        char[] ch2 = s4.toCharArray();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<ch1.length;i++){
            arr1[ch1[i]-'a']++;
            arr2[ch2[i]-'a']++;
        }
        return Arrays.equals(arr1, arr2);
    }
}
