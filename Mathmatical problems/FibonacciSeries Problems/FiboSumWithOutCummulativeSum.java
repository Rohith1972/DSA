/*
    ProblemStatement:
    Given n, find sum of first n Fibonacci numbers without using cumulative sum.
*/
import java.util.Scanner;
class FiboSumWithOutCummulativeSum{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = nFibo(n+2);
        System.out.println(res);
    }
    static int nFibo(int n){
        int res = 0;
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
            res = c;
        }
        return res - 1;
    }
}