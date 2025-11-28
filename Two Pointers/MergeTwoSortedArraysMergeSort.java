import java.util.*;
/*
Problem 7: Merge Two Sorted Arrays
Given two sorted arrays, merge them into a single sorted array.
Input:
- First line: n -> size of first array
- Second line: n space-separated integers (first array)
- Third line: m -> size of second array
- Fourth line: m space-separated integers (second array)
Output:
- Print merged sorted array
*/
// 7.1 Merge and Sort
class MergeTwoSortedArraysMergeSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) 
           a[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++) 
            b[i]=sc.nextInt();
        int[] c=new int[n+m];
        for(int i=0;i<n;i++)
           c[i]=a[i];
        for(int i=0;i<m;i++)
            c[n+i]=b[i];
        Arrays.sort(c);
        for(int x:c) System.out.print(x+" ");
    }
}

