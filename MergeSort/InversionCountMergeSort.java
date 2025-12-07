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
public class InversionCountMergeSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = mergeSort(arr,0,n-1);
        System.out.println(res);
    }
    static int mergeSort(int[] a,int l,int r){
        int count = 0;
        if(l<r){
            int m = l+(r-l)/2;
            count+=mergeSort(a, l, m);
            count+=mergeSort(a, m+1, r);
            count+=merge(a,m,l,r);
        }
        return count;
    }
    static int merge(int[] a,int m,int l,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int count = 0;
        for(int i=0;i<n1;i++){
            L[i] = a[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i] = a[m+1+i];
        }
        int i=0,j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j])
                a[k++] = L[i++];
            else{
                a[k++] = R[j++];
                count += m-l+1;
            }
        }
        while(i<n1){
            a[k++] = L[i++];
        }
        while(j<n2){
            a[k++] = R[j++];
        }
        return count;
    }
}