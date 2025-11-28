/*
    ProblemStatement:
    Given a array of n integers and a target , the Array is Sorted by rotated , Now check whether the target exists
    in the Array or not if exist return it's idex if not return -1. Using BinarySearch.
    Input:
    n = 5
    [4,5,1,2,3]
    target = 5
    Output:
    1
*/
import java.util.Scanner;
class BinarySearchRotatedSortedArray{
    static int binarySearch(int arr[],int n,int target){
        int result = -1;
        int l=0,h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[l]<=arr[mid]){
                if(arr[l] == target)
                    return l;
                else{
                    l=l+1;
                    h=mid-1;
                }
            }else{
                if(arr[l] == target)
                    return l;
                else{
                    l=l+1;
                    h=mid-1;
                }
            }
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