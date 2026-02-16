/*
    ProblemStatement:
    Given an integer n, compute and return the nth Fibonacci number using the Memorization (Dynamic 
    Programming) method where F(1) = 0, F(2) = 1 and for n ≥ 3, F(n) = F(n-1) + F(n-2).
    Input:
    n = 5
    Output:
    3
    TimeComplexity: O(n)
    SpaceComplexity: O(n)
*/
import java.util.Scanner;
class FibonacciMemorization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibn(n);
        System.out.println(res);
    }
    static int fibn(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibn(n-1)+fibn(n-2);
    }
}