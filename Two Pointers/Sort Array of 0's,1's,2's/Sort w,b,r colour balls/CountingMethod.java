/*
    ProblemStatement:
    We are given an array of n elements which are w's, b's, r's. Now sort the elements and 
    return array. Using counting method.
    input:
    5
    [r,r,b,w,w]
    output:
    [w,w,b,r,r]
*/
import java.util.ArrayList;
import java.util.Scanner;
public class CountingMethod {
    static char[] countingMethod(int[] arr,int n){
        int wCount=0;
        int bCount=0;
        int rCount=0;
        ArrayList<Character> res1 = new ArrayList<>();
        char[] res = new char[n];
        for(int i=0;i<n;i++){
            if(arr[i]=='w')
                wCount++;
            else if(arr[i]=='b')
                bCount++;
            else
                rCount++;
        }
        for(int i=0;i<wCount;i++){
            res1.add('w');
        }
        for(int i=0;i<bCount;i++){
            res1.add('b');
        }
        for(int i=0;i<rCount;i++){
            res1.add('r');
        }
        for(int i=0;i<n;i++){
            res[i] = res1.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        char[] res = countingMethod(arr,n);
        for(char i : res){
            System.out.print(i+" ");
        }
    }
}
