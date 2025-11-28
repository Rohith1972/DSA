/*
    ProblemStatement:
    Given 2 Arrays of sizes m & n , merge those 2 Arrays and return the result Array.Print the result
    Array in the main method.
*/
import java.util.Scanner;
public class MergeTwoArraysTwoPointers {
    static int[] merge(int[] a,int n,int[] b,int m){
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
        return res;
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
        int[] res = merge(a,n,b,m);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
