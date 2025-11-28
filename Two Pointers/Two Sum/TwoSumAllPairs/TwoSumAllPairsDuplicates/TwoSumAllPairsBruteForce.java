/*
    ProblemStatement:
    You are given an array of n integers which are distinct and sorted. Now, we are also given a
    target. Find and return all pairs where sum equals to target. using brute force technique.
    Note: Array contains duplicates.
    Input:
    n = 8
    [2,3,3,6,6,6,9]
    target:9
    Output:
    [[3, 6], [3, 6], [3, 6], [3, 6], [3, 6], [3, 6]]
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class TwoSumAllPairsBruteForce{
    static List<List<Integer>> findAllPairs(int[] arr,int target,int n){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    List<Integer> t = new ArrayList<>();
                    t.add(arr[i]);
                    t.add(arr[j]);
                    res.add(t);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<List<Integer>> res = findAllPairs(arr,target,n);
        System.out.println(res);
    }
}