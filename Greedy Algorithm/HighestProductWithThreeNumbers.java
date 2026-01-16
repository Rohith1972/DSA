/*
    ProblemStatement:
    Given an Array of n integers that includes positive and negative numbers . Now find and return
    highest possible product by multiplying any three numbers.
    Input:
    n = 5
    arr[] = {1,2,3,4,5}
    Output:
    60
*/
import java.util.Scanner;
public class HighestProductWithThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = maxProduct(arr,n);
        System.out.println(res);
    }
    static int maxProduct(int[] arr,int n){
        int p1 = arr[0]*arr[1]*arr[n-1];
        int p2 = arr[n-1]*arr[n-2]*arr[n-3];
        return Math.max(p1,p2);
    }
}
