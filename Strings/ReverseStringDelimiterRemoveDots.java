/*
    Given a string of words seperated by delimetr ., 
    and string has no of .s as leading and trailing  reverse the words in string.
*/
import java.util.Scanner;
class ReverseStringDelimiterRemoveDots {
    static String reverse(String s) {
        s = s.replaceAll("^\\.+|\\.+$", "");
        String[] ch = s.split("\\.");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            StringBuilder obj = new StringBuilder(ch[i]);
            obj.reverse();  
            res.append(obj.toString());
            if (i != ch.length - 1)  
                res.append(".");
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = reverse(s);
        System.out.println(res);
    }
}
