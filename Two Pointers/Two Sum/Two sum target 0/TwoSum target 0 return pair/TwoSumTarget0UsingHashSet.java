/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to 0
    or not.Using HashSet.

*/
import java.util.HashSet;
import java.util.Scanner;
public class TwoSumTarget0UsingHashSet {
    static int[] twoSum(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(hs.contains(-arr[i])){
                return new int[]{arr[i],-arr[i]};
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
        int[] res = twoSum(arr);
        for(int i : arr){
             System.out.print(i+" "); 
        }
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}

