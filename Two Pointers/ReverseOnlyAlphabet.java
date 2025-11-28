import static java.lang.Character.*;
import java.util.Scanner;
public class ReverseOnlyAlphabet {
    static String reverse(String s){
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<=j){
            if(isLetter(ch[i])&&isLetter(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }else if(!isLetter(ch[i])){
                i++;
            }else
                j--;
        }
        String res = String.valueOf(ch);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        String res = reverse(s);
        System.out.println(res);
    }
}
