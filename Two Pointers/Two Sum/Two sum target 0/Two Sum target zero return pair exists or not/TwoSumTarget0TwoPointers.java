/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to 0
    or not.Using sorting and two pointers.

*/
import java.util.Arrays;
import java.util.Scanner;
public class TwoSumTarget0TwoPointers {
    static boolean twoSum(int[] arr){
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==0)
                return true;
            else if(res<0)
                i++;
            else
                j--;
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

