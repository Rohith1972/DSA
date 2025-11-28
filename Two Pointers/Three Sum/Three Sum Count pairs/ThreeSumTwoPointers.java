/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now return count 
    of triplet where sum of elements equals to target. - Using TwoPointers
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    3
*/
import java.util.Arrays;
import java.util.Scanner;
class ThreeSumTwoPointers{
    static int threeSum(int[] arr,int n,int target){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            int l=0,h=n-1;
            while(l<h){
                int sum =arr[i]+arr[l]+arr[h] ;
                if(sum == target){
                    count++;
                    l++;
                    h--;
                }else if(sum<target){
                    l++;
                }else{
                    h--;
                }
            }
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
        int res = threeSum(arr,n,target);
        System.out.println(res);
    }
}