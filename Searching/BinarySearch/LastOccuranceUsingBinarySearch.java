/*
    ProblemStatement:
    Given Array of n integers which are sorted and there may be duplicate elements also. You are also
    given a target element x , Now find the position of last occurance of x in the Array using binary
    search. Expected TimeComplexity: O(logn).
    Input:
    n=5
    [1,2,2,2,3]
    Output:
    3
*/
import java.util.Scanner;
class LastOccuranceUsingBinarySearch{
    static int lastIndex(int arr[],int n,int target){
        int result = -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                result = mid;
                l = mid + 1;
            }
            else if(target > arr[mid])
                l = mid + 1;
            else
                h = mid - 1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = lastIndex(arr,n,target);
        System.out.println(index);
    }
}