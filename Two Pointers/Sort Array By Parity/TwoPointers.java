/*
    ProblemStatement:
    Given an array of numbers ( integers) .now move all even numbers to beginning of array and all 
    odd numbers placed after even numbers. Return modified array. using Two Pointers.
    Input:
    5
    [1,2,3,4,5]
    Output:
    [4,2,3,1,5]
*/
import java.util.Scanner;
class TwoPointers{
    static int[] twoPointers(int[] arr,int n){
        int left=0,right=n-1;
        while(left<right){
            while(left<right && arr[left]%2==0){
                left++;
            }
            while(left<right && arr[right]%2!=0){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = twoPointers(arr,n);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}