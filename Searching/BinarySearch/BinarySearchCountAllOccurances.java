/*
    ProbemStatement:
    Given an Array of n Integers sorted , and a target . Now compute the number of occurances of the target in the 
    Array using BinarySearch.
    Input:
    12
    [2,6,9,9,9,9,9,15,15,15,24,24]
    9
    Output:
    5
*/
import java.util.Scanner;
class BinarySearchCountAllOccurances{
    static int firstIndex(int arr[],int n,int target){
        int result = -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                result = mid;
                h = mid - 1;
            }
            else if(target > arr[mid])
                l = mid + 1;
            else
                h = mid - 1;
        }
        return result;
    }
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
        int index1 = firstIndex(arr,n,target);
        int index2 = lastIndex(arr,n,target);
        if(index1==-1 && index2==-1)
            System.out.println(0);
        else
            System.out.println(index2-index1+1);
    }
}
