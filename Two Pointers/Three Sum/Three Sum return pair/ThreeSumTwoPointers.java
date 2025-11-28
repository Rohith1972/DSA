/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now return 
    a triplet where sum of elements equals to target if not exists return [-1,1,-1].-Using TwoPointers
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    [2,15,1]
*/
import java.util.Arrays;
import java.util.Scanner;
class ThreeSumTwoPointers{
    static int[] threeSum(int[] arr,int n,int target){
        Arrays.sort(arr);
        int[] res = new int[3];
        outer:
        for(int i=0;i<n;i++){
            int l=0,h=n-1;
            while(l<h){
                int sum =arr[i]+arr[l]+arr[h] ;
                if(sum == target){
                    res[0] = arr[i];
                    res[1] = arr[l];
                    res[2] = arr[h];
                    break outer;
                }else if(sum<target){
                    l++;
                }else{
                    h--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = threeSum(arr,n,target);
        for(int num : res){
            System.out.print(num + " ");
        }
    }
}