/*
    ProblemStatement:
    Given array of n unsorted integers which are distinct , verify whether pair exists with sum equal to 0
    or not.Using Brute force approach.
    Note: The Array contains elements of positives negatives and zeros also.

*/
import java.util.Scanner;
public class TwoSumTarget0BruteForce {
    static int[] twoSum(int[] arr){
        int x =-1, y =-1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==0&& !(arr[i]==0 && arr[j]==0)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        return new int[]{x,y};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = twoSum(arr);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}
