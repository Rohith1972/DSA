/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to target 
    or not.Using HashSet.

*/
import java.util.HashSet;
import java.util.Scanner;
public class TwoSumUsingHashSet {
    static boolean twoSum(int[] arr,int target){
        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(hs.contains(complement)&&complement!=arr[i])
                return true;
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
        boolean res = twoSum(arr,target);
        System.out.println(res);
    }
}
