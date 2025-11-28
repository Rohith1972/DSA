/*
    ProblemStatement:
    Given n, find and display first n Fibonacci numbers.
*/
import java.util.Scanner;
class NFibos{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nFibo(n);
    }
    static void nFibo(int n){
        if(n==0)
            System.out.println(0);
        if(n==1)
            System.out.println(1);
        else{
            int a=0,b=1,c=0;
            System.out.print(a+" "+b+" ");
            for(int i=2;i<=n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
