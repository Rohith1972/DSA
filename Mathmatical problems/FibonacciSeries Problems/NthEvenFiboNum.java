/*
    ProblemStatement:
    Given a number n, return nth even fibonacci number.
*/
import java.util.Scanner;
public class NthEvenFiboNum {
    static int nEvenFibo(int n){
        int res=0;
        if(n==1)
            return 0;
        else{
            int a=0,b=1,c=0,count=1;
            while(count<n){
                c=a+b;
                if(c%2==0)
                    count++;
                a=b;
                b=c;
            }
            res = b;
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
