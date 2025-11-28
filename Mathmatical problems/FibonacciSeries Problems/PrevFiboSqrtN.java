/*
    ProblemStatement:
    Given n a Fibonacci number, find previous Fibonacci number using O(sqrt(n)).
*/
import java.util.Scanner;
public class PrevFiboSqrtN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(true){
            if(isFibo(n)){
                res = n;
                break;
            }
            n--;
        }
        System.out.print(res);
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

