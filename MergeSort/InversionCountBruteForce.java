/*
    ProblemStatement:
    Given an Array of n Integers.Count the number of inversions in the Array.
    Inversion: i<j && a[i]>a[j]
    Input:
    n=5
    a = [5,4,3,2,1]
    Output:
    10
*/

import java.util.Scanner;

public class InversionCountBruteForce {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = countInversions(arr,n);
        System.out.println(res);
    }
    static int countInversions(int[] a,int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                    count++;
            }
        }
        return count;
    }
}
