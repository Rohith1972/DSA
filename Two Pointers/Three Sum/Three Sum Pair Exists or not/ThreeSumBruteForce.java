/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now verify 
    whether there exists a triplet or not where sum of elements equals to target. - Using BurteForce
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    true
*/
import java.util.Scanner;
class ThreeSumBruteForce{
    static boolean threeSum(int[] arr,int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == target)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean res = threeSum(arr,n,target);
        System.out.println(res);
    }
}