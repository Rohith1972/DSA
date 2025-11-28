import java.util.Scanner;
public class StringReverse {
    static String reverse(String s){
        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            res.append(s.charAt(i));
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = reverse(s);
        System.out.print(res);
    }
}
