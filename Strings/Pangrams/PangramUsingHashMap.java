/*
    ProblemStatement:
    Given a string that may consists English alphabets, digits, symbols. Here both lower case and 
    upper case are considered the same. Verify whether the string is pangram or not using HashMap.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class PangramUsingHashMap
{
    public static boolean isPangram(String str)
     {
        str = str.toLowerCase();
        HashMap<Character, Boolean> map=new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, false);
        }
        for (int i=0;i<str.length();i++)
         {
            char ch=str.charAt(i);
            if (map.containsKey(ch)) 
            {
                map.put(ch, true);
            }
        }
        return !map.containsValue(false);
    }

    public static void main(String[] args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string:");
        String input = br.readLine();
        System.out.println(isPangram(input) ?"Pangram":"Not Pangram");
    }
}