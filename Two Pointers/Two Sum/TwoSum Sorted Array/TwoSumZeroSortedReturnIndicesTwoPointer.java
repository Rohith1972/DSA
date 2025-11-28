import java.util.*;
/*
Problem 6: Two Sum Zero (Sorted Data) — Return Indices
Return 0-based indices of a pair whose sum is zero. If no pair exists, return -1 -1
*/
// 6.2 Two Pointer
class TwoSumZeroSortedReturnIndicesTwoPointer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int l=0,r=n-1,i1=-1,i2=-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==0){i1=l;i2=r; break;}
            else if(sum<0) l++;
            else r--;
        }
        System.out.println(i1+" "+i2);
    }
}
