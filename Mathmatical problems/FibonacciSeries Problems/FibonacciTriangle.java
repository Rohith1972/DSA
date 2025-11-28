/*
    ProblemStatement:
    Given an integer n , print the fibonnacii triangle.
*/
import java.util.Scanner;
public class FibonacciTriangle {
    public static void printFibonacciTriangle(int n) {
        int a = 0, b = 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printFibonacciTriangle(n);
        sc.close();
    }
}
