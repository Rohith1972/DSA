/*
    ProblemStatement:
    Given array of unsorted integers and target, verify whether pair exists with sum equal to 0
    or not.Using HashSet.

*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class TwoSumTarget0UsingHashSet {
    static int[] twoSum(int[] arr){
        Arrays.sort(arr);
        int x =-1,y=-1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(hs.contains(-arr[i])){
                x = i;
                break;
            }
        }
        int target = arr[x];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-target)
                y = i; 
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
        for(int i : arr){
             System.out.print(i+" "); 
        }
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}

