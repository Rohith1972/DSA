/*
    ProblemStatement:
    Given an Array of n integers . Sort the values in the Array using the MergeSort algorithm.
    Intput:
    n=5
    arr = [5,4,3,2,1]
    Output:
    [1,2,3,4,5]
*/
import java.util.Scanner;
public class MergeSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(Integer x : arr){
            System.out.print(x + " ");
        }
    }
    static void mergeSort(int[] a,int l,int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a,m,l,r);
        }
    }
    static void merge(int[] a,int m,int l,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
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
            else
                a[k++] = R[j++];
        }
        while(i<n1){
            a[k++] = L[i++];
        }
        while(j<n2){
            a[k++] = R[j++];
        }
    }
}