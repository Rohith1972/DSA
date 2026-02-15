/*
    ProblemStatement:
    Given an Array of n integers and also k. Now find and return sum of each
    subArray of size k using Sliding window logic1.
    Input:
    n = 5
    k = 3
    arr[] = {1,2,3,4,5}
    Output:
    res[] = {6,9,12}
    TimeComplexity: O(n)
    SpaceComplexity: O(n-k+1)
*/
import java.util.ArrayList;
import java.util.Scanner;
public class SumSubArraySizeKSlidingWindowLogic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = subArraySum(arr,n,k);;
        for(int i=0;i<n-k+1;i++){
            System.out.print(res.get(i)+" ");
        }
    }
    static ArrayList<Integer> subArraySum(int[] arr,int n,int k){
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        res.add(0 ,sum);
        for(int i=1;i<n-k+1;i++){
            sum -= arr[i-1];
            sum += arr[i+k-1];
            res.add(i,sum);
        }
        return res;
    }
}
