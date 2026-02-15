/*
    ProblemStatement:
    Given an Array of n integers and also k. Now find and return sum of each
    subArray of size k using BruteForce method.
    Input:
    n = 5
    k = 3
    arr[] = {1,2,3,4,5}
    Output:
    res[] = {6,9,12}
    TimeComplexity: O(n*k)
    SpaceComplexity: O(n-k+1)
*/
import java.util.ArrayList;
import java.util.Scanner;
public class SumSubArraySizeKBruteForce{
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
        for(int i=0;i<n-k+1;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += arr[j];
            }
            res.add(sum);
        }
        return res;
    }
}