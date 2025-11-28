/*
    ProblemStatement:
    Given n, find and display  Fibonacci numbers up to n.
*/
import java.util.Scanner;
class FiboLessN{
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
            while(c<=n){
                c=a+b;
                System.out.print(b+" ");
                a=b;
                b=c;
            }
        }
    }
}
