/*
    ProblemStatement:
    Given 2 Arrays of sizes n & m . Which are sorted Arrays. Now merge and find a sorted Array using 
    those 2 Arrays. After merge operation first n elements should be copied into first Array and the 
    second m elements should be copied into the second Array.The output should be in driver code and 
    updated using call by reference. 
*/
import java.util.Scanner;
public class MergeTwoArraysAndSplitAgain {
    static void merge(int[] a,int n,int[] b,int m){
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<=b[j]){
                res[k++] = a[i];
                i++;
            }
            else{
                res[k++] = b[j];
                j++; 
            }
        }
        while(i<n){
            res[k++] = a[i++];
        }
        while(j<m){
            res[k++] = b[j++];
        }
        for(int p=0;p<n;p++){
            a[p] = res[p]; 
        }
        for(int q=0;q<m;q++){
            b[q] = res[n+q];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        merge(a,n,b,m);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : b){
            System.out.print(i+" ");
        }
    }
}
