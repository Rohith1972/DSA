import java.util.*;
/*
Problem 6: Two Sum Zero (Sorted Data) — Return Indices
Return 0-based indices of a pair whose sum is zero. If no pair exists, return -1 -1
*/

// 6.1 Brute Force
class TwoSumZeroSortedReturnIndicesBruteForce{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
           arr[i]=sc.nextInt();
        int i1=-1,i2=-1;
        outer: for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0){
                    i1=i;i2=j; 
                    break outer;
                    }
            }
        }
        System.out.println(i1+" "+i2);
    }
}
