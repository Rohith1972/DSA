/*
    ProblemStatement:
    Given a string that may consists English alphabets, digits, symbols. Here both lower case and 
    upper case are considered the same. Verify whether the string is pangram or not using HashSet.
*/
import java.util.HashSet;
import java.util.Scanner;
public class PangramUsingHashSet
 {
    public static boolean isPangram(String str)
     {
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<str.length();i++)
         {
            char ch=str.charAt(i);
            if (ch>='a'&&ch <='z') 
            {
                set.add(ch);
            }
        }
        return set.size()==26;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(isPangram(input) ?"Pangram":"Not Pangram");
        sc.close();
    }
}