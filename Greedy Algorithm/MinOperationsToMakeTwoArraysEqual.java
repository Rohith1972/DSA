/*
    ProblemStatement:
    Given two Arrays of same size n. Now transform the elements of Array 1 to Array2(Make Array1 equals
    to Array2) with minimum number of operations. In one operation you an increase any element by one
    or you can decrease any element by one. The order of appearence of elements meed not to be same.
    Input:
    n = 4
    arr1 = [4,1,5,2]
    arr2 = [1,1,4,4]
    Output:
    2
*/
import java.util.Arrays;
import java.util.Scanner;
class MinOperationsToMakeTwoArraysEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        int count = minOperations(arr1,arr2,n);
        System.out.println(count);
    }
    static int minOperations(int[] a,int[] b,int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        for(int i=0;i<n;i++){
            count += Math.abs(a[i]-b[i]);
        }
        return count;
    }
}