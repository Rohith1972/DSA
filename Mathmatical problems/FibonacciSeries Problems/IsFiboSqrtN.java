/*
    ProblemStatement:
    Given n, verify whether n is Fibonacci or not using O(n)
*/
import java.util.Scanner;
public class IsFiboSqrtN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean var = isFibo(key);
        System.out.print(var);
    }
    static boolean isFibo(int key){
        if(key==0)
            return true;
        if(key==1)
            return true;
        int a=0,b=1,c=0;
        for(int i=2;i<=key;i++){
            c=a+b;
            if(c==key)
                return true;
            a=b;
            b=c;
        }
        return false;
    }
}
