import java.util.*;
/*
Problem 5: Two Sum Zero (Sorted Data) — Return Pair
Return any pair whose sum is zero. If no pair exists, print -1 -1
*/
// 5.1 Brute Force
class TwoSumZeroSortedReturnPairBruteForce{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
          arr[i]=sc.nextInt();
        int a=-1,b=-1;
        outer: for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0){a=arr[i];b=arr[j]; break outer;}
            }
        }
        System.out.println(a+" "+b);
    }
}

