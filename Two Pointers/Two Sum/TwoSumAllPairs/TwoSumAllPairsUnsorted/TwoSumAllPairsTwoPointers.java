/*
    ProblemStatement:
    You are given an array of n integers which are distinct and unsorted. Now, we are also given a
    target. Find and return all pairs where sum equals to target. using Two Pointers technique.
    Input:
    n = 8
    [6,1,3,5,4,7,2,12]
    target:9
    Output:
    [[6,3],[5,4],[7,2]]
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class TwoSumAllPairsTwoPointers{
    static List<List<Integer>> findAllPairs(int[] arr,int target,int n){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int i=0,j=n-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                List<Integer> t = new ArrayList<>();
                t.add(arr[i]);
                t.add(arr[j]);
                res.add(t);
                i++;
                j--;
            }else if(sum<target)
                i++;
            else
                j--;
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