/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to target 
    or not if exists return indices else [-1,-1].Using sorting and two pointers.

*/
import java.util.Arrays;
import java.util.Scanner;
public class TwoSumSortingTwoPointer {
    static int[] twoSum(int[] arr,int target){
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==target)
                return new int[]{i,j};
            else if(res<target)
                i++;
            else
                j--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = twoSum(arr,target);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}
