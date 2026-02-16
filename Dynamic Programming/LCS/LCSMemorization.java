
import java.util.Scanner;
public class LCSMemorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();  
        String s2 = sc.next();
        int res = lcs(s1,s2,s1.length(),s2.length());
        System.out.println(res);
    }
    static int lcs(String s1,String s2,int m,int n){
        if(m == 0 || n == 0)
                return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return 1 + lcs(s1,s2,m-1,n-1);
        else
            return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
    }
}
