import java.util.*;
/*
Problem 5: Two Sum Zero (Sorted Data) — Return Pair
Return any pair whose sum is zero. If no pair exists, print -1 -1
*/
// 5.2 Two Pointer
class TwoSumZeroSortedReturnPairTwoPointer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();

        int l=0,r=n-1,a=-1,b=-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==0){a=arr[l];b=arr[r]; break;}
            else if(sum<0) l++;
            else r--;
        }
        System.out.println(a+" "+b);
    }
}
