/*
    ProblemStatement:
    Given a number n, return nth odd fibonacci number.
*/
import java.util.Scanner;
public class NthEvenFiboOpt {
    static int nEvenFibo(int n){
        int res=0;
        if(n==1)
            return 0;
        else{
            int a=0,b=2,c=0;
            for(int i=1;i<=n;i++){
                c=(4*b)+a;
                a=b;
                b=c;
            }
            res = c;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = nEvenFibo(n);
        System.out.println(res);
    }
}
