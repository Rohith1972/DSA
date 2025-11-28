import java.util.*;
/*
Problem 4: Two Sum Zero (Sorted Data) — Verify Pair Exists
Given a sorted array, check whether any two elements sum to zero.
Input:
- First line: n -> size
- Second line: n space-separated integers (sorted)
Output:
- Print "YES" if pair exists, otherwise "NO"
*/
// 4.2 Two Pointer
class TwoSumZeroSortedTwoPointer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();

        int l=0,r=n-1;
        boolean found=false;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==0){found=true; break;}
            else if(sum<0) l++;
            else r--;
        }
        System.out.println(found?"YES":"NO");
    }
}
