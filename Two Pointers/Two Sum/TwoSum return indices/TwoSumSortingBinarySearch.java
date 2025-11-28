/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to target 
    or not if exists return indices else [-1,-1].Using sorting and BinarySearch.

*/
import java.util.Arrays;
import java.util.Scanner;
public class TwoSumSortingBinarySearch {
    static boolean binarySearch(int[] arr,int target,int i,int j){
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return false;
    }
    static int twoSum(int[] arr,int target,int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(binarySearch(arr,target-arr[i],i+1,n-1)&&arr[i]!=target-arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = twoSum(arr,target,n);
        int first = -1,second = -1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]+arr[res]==target){
                first = res;
                second = i;
                break;
            } 
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("["+arr[first]+","+arr[second]+"]");
    }
}
