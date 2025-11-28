/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Binary Search algorithm if exits return true else return false.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    true
*/
import java.util.Scanner;
class BinarySearchBoolean{
    static boolean binarySearch(int arr[],int n,int target){
        int result = -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target > arr[mid])
                l = mid + 1;
            else
                h = mid - 1;
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
        boolean index = binarySearch(arr,n,target);
        System.out.println(index);
    }
}