/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to target 
    or not if exits return the pair else [-1,-1].Using Brute force approach.
*/
import java.util.Scanner;
public class TwoSumBruteForce {
    static int[] twoSum(int[] arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                    return new int[]{arr[i],arr[j]};
            }
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
