/*
    ProblemStatement:
    Given an integer n , return the last digit of the nth fibonacci number.
*/
import java.util.Scanner;
public class LastDigitNthFibo {
    static int lastDigitNthFibo(int n){
        int N = n%60;
        int f[] = new int[N];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<N;i++){
            f[i]=(f[i-1]+f[i-2])%10;
        } 
        return f[N-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = lastDigitNthFibo(n);
        System.out.println(res);
    }
}
