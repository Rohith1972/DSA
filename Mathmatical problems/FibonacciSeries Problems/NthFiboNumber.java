/*
    ProblemStatement:
    Given n, Find nth Fibonacci numbers.
*/
import java.util.Scanner;
class NFibo{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = nFibo(n);
        System.out.println(res);
    }
    static int nFibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else{
            int a=0,b=1,c=0;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
}