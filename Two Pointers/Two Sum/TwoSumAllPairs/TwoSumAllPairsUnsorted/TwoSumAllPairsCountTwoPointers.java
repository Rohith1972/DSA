/*
    ProblemStatement:
    You are given an array of n integers which are distinct and unsorted. Now, we are also given a
    target. Find and return count of all pairs where sum equals to target. using Two Pointers technique.
    Input:
    n = 8
    [6,1,3,5,4,7,2,12]
    target:9
    Output:
    3
*/
import java.util.Arrays;
import java.util.Scanner;
class TwoSumAllPairsCountTwoPointers{
    static int findAllPairs(int[] arr,int target,int n){
        Arrays.sort(arr);
        int i=0,j=n-1;
        int count=0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                count++;
                i++;
                j--;
            }else if(sum<target)
                i++;
            else
                j--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = findAllPairs(arr,target,n);
        System.out.println(res);
    }
}