/*
    ProblemStatement:
    Given n, find and return  Fibonacci numbers up to n.
*/
import java.util.ArrayList;
import java.util.Scanner;
class ReturnFibosUpToN{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = nFibo(n);
        for(Integer i : res){
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> nFibo(int n){
        ArrayList<Integer> res = new ArrayList<>();
        if(n==0)
            res.add(0);
        if(n==1)
            res.add(1);
        else{
            int a=0,b=1,c=0;
            res.add(0);
            res.add(1);
            while(c<=n){
                c=a+b;
                res.add(b);
                a=b;
                b=c;
            }
        }
        return res;
    }
}
