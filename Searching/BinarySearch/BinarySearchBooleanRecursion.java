/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Binary Search algorithm if exits return true else return false using recursion.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    true
*/
import java.util.Scanner;
class BinarySearchBooleanRecursion{
    static boolean binarySearch(int arr[],int l,int h,int target){
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target > arr[mid])
                return binarySearch(arr,l = mid + 1,h,target);
            else
                return binarySearch(arr,l,h = mid - 1,target);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean index = binarySearch(arr,0,n-1,target);
        System.out.println(index);
    }
}