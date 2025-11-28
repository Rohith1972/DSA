/*
    ProblemStatement:
    Given a String s , Compress the given String as follows:
    Input:
    s = "abbbbbbbbbbbbcccccccccdd"
    Output:
    res = "a1bCc9d2"
*/
import java.util.Scanner;
class StringCompressionToHexaDecimal{
    static String compress(String s){
        char ch=s.charAt(0);
        int count=1;
        StringBuilder res = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch)
                count++;
            else{
                res.append(ch);
                res.append(Integer.toHexString(count).toUpperCase());
                ch = s.charAt(i);
                count=1;
            }
        }
        res.append(ch);
        res.append(count);
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = compress(s);
        System.out.print(res);
    }
}