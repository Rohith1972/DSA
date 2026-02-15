/*
    ProblemStatement:
    Given an Array of n integers and also k. Now find and return average of each
    subArray of size k using Sliding window logic1.
    Input:
    n = 5
    k = 3
    arr[] = {1,2,3,4,5}
    Output:
    res[] = {2,3,4}
    TimeComplexity: O(n)
    SpaceComplexity: O(n-k+1)
*/
import java.util.Scanner;
public class AverageSubArraySizeKSlidingWindowLogic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = subArrayAvg(arr,n,k);;
        for(int i=0;i<n-k+1;i++){
            System.out.print(res[i]+" ");
        }
    }
    static int[] subArrayAvg(int[] arr,int n,int k){
        int[] res = new int[n-k+1];
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        res[0] = sum/k;
        for(int i=1;i<n-k+1;i++){
            sum -= arr[i-1];
            sum += arr[i+k-1];
            res[i] = sum/k;
        }
        return res;
    }
}
