/*
    ProblemStatement:
    You are given an Array of n integers also k . Now find and return Max of all subArrays sum of size k using 
    Bruteforce method.
    Input:
    n = 8
    k = 3
    a[] = [10,50,60,80,90,100,20,60]
    Output:
    270
    TimeComplexity:O(nk-k^2)
    SpaceComplexity:O(n-k+1) 
*/
import java.util.Scanner;
class SubArraysMaxSumSizeKBruteForce{
    public static int subArrays(int[] a,int n,int k){
        int res = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int s = 0;
            for(int j=i;j<i+k;j++){
                s += a[j];
            }
            res = Math.max(s,res);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = subArrays(a,n,k);
        System.out.println(res);
    }
}