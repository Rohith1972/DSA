/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to 0
    or not.Using HashSet.

*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class TwoSumTarget0UsingHashSet {
    static boolean twoSum(int[] arr){
        Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(hs.contains(-arr[i]))
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
        boolean res = twoSum(arr);
        System.out.println(res);
    }
}

