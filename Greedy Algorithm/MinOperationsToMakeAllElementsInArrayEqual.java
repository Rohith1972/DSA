/*
    ProblemStatement:
    Given an Array of size n. Now find minimum number of operations to make all the elements
    of Array equal return that minimum number of operations
    Input:
    n = 4
    arr1 = [4,1,5,2]
    Output:
    6
*/
import java.util.Arrays;
import java.util.Scanner;
class MinOperationsToMakeAllElementsInArrayEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = minOperations(arr,n);
        System.out.println(count);
    }
    static int minOperations(int[] a,int n){
        Arrays.sort(a);
        int count = 0;
        int mid = a[(n-1)/2];
        for(int i=0;i<n;i++){
            count += Math.abs(a[i]-mid);
        }
        return count;
    }
}