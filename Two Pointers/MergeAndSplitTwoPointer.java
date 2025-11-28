import java.util.*;
/*
ProblemStatement: Merge Two Sorted Arrays and Copy Back
Merge two sorted arrays into a single sorted array.
After merge, copy first n elements into first array, next m elements into second array.
Input:
- n, first array
- m, second array
Output:
- Print modified first array
- Print modified second array
*/
// 8.2 Two Pointer
class MergeAndSplitTwoPointer{
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
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j]) 
               c[k++]=a[i++];
            else
               c[k++]=b[j++];
        }
        while(i<n) 
            c[k++]=a[i++];
        while(j<m) 
            c[k++]=b[j++];
        for(i=0;i<n;i++) 
            a[i]=c[i];
        for(i=0;i<m;i++)
            b[i]=c[n+i];
        for(int x:a) System.out.print(x+" ");
        System.out.println();
        for(int x:b) System.out.print(x+" ");
    }
}


