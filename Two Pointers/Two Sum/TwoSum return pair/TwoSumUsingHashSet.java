/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to target 
    or not if exists return pair else return [-1,-1].Using HashSet.

*/
import java.util.HashSet;
import java.util.Scanner;
public class TwoSumUsingHashSet {
    static int[] twoSum(int[] arr,int target){
        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        int first=-1,second=-1,complement=0;
        for(int i=0;i<arr.length;i++){
            complement = target-arr[i];
            if(hs.contains(complement)&&complement!=arr[i]){
                first = i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==complement)
                second = i;
        }
        return new int[]{arr[first],arr[second]};
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
