/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to 0
    or not.Using sorting and two pointers.

*/
import java.util.Arrays;
import java.util.Scanner;
public class TwoSumTarget0TwoPointers {
    static int[] twoSum(int[] arr){
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==0){
                return new int[]{i,j};
            }
            else if(res<0)
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
        int[] res = twoSum(arr);
        for(int i : arr){
             System.out.print(i+" "); 
        }
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}
