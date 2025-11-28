/*
    ProblemStatement:
    Given n a Fibonacci number, find previous Fibonacci number using O(n).
*/
import java.util.Scanner;
class PrevFiboN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = prevFibo(n);
        System.out.println(res);
    }
    static int prevFibo(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        int a=0,b=1;
        while(b<=n){
            int c = a+b;
            a=b;
            b=c;
        }
        return a;
    }
}