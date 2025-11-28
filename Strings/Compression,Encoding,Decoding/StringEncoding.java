import java.util.Scanner;
public class StringEncoding {
    static String encode(String s){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c <='z'){
                if(i%2 != 0){
                    if(c == 'z'){
                        res.append('a');
                    }else{
                        int val = (int)c;
                        char ch = (char)(val+1);
                        res.append(ch);
                    }
                }else{
                    if(c == 'a'){
                        res.append('z'); 
                    }else{
                        int val = (int)c;
                        char ch = (char)(val-1);
                        res.append(ch);
                    }
                }
            }else{
                 res.append(c);
            }
        }
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = encode(s);
        System.out.print(res);
    }
}
