/*
    ProblemStatement:
    Given array of n unsorted integers which are distinct , verify whether pair exists with sum equal to 0
    or not.Using Brute force approach.
    Note: The Array contains elements of positives negatives and zeros also.

*/
import java.util.Scanner;
public class TwoSumTarget0BruteForce {
    static boolean twoSum(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0&& !(arr[i]==0 && arr[j]==0))
                    return true;
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
        boolean res = twoSum(arr);
        System.out.println(res);
    }
}
