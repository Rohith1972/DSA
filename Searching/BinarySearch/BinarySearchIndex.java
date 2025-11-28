/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Binary Search algorithm if exits return index else return -1.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    4
*/
import java.util.Scanner;
class BinarySearchIndex{
    static int binarySearch(int arr[],int n,int target){
        int result = -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target > arr[mid])
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = binarySearch(arr,n,target);
        System.out.println(index);
    }
}