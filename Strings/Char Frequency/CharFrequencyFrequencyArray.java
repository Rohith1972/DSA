/*
    Problem Statement:
    Given a string that consists of only English alphabets and both uppercase and lowercase are 
    considered the same. Find the frequency of each character in the string.  
    Using FrequencyArray.
*/
import java.util.Scanner;
class CharFrequencyFrequencyArray{
    static void freqCount(String s1){
        String s = s1.toLowerCase();
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'a';
            arr[ch]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0)
                System.out.println(((char)(i+'a'))+" : "+arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        freqCount(s);
    }
}