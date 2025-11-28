/*
    ProblemStatement:
    Given n, verify whether n is Fibonacci or not using O(sqrt(n)).
*/
import java.util.Scanner;
public class IsFiboN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean var = isFibo(key);
        System.out.print(var);
    }
    static boolean isFibo(int n){
        if(perfect((5*(n*n))-4)||perfect((5*(n*n))+4)){
            return true;
        }
        return false;
    }
    static boolean perfect(int n){
        double res = Math.sqrt(n);
        return res*res==n;
    }
}
