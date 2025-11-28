/*
    ProblemStatement:
    Given two strings that consists only English alphabets. Here both lower case and upper case are
    considered the same. Now verify whether two strings are anagrams are not- using sorting.
*/
import java.util.Arrays;
import java.util.Scanner;
class AnagramsUsingSorting{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean res = areAnagrams(s1,s2);
        System.out.println(res);
    }
    static boolean areAnagrams(String s1,String s2){
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char[] ch1 = s3.toCharArray();
        char[] ch2 = s4.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s5 = String.valueOf(ch1);
        String s6 = String.valueOf(ch2);
        return s5.equals(s6);
    }
}