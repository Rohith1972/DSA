/*
    ProblemStatement:
    You are given an array of n integers which are distinct and sorted. Now, we are also given a
    target. Find and return all pairs where sum equals to target. using Hashing technique.
    Input:
    n = 8
    [6,1,3,5,4,7,2,12]
    target:9
    Output:
    [[6,3],[5,4],[7,2]]
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
class TwoSumAllPairsHashing{
    static List<List<Integer>> findAllPairs(int[] arr,int target,int n){
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = arr[i];
            int x1 = target - arr[i];
            if(hm.containsKey(x1)){
                List<Integer> t = new ArrayList<>();
                t.add(x1);
                t.add(x);
                res.add(t);
            }
            hm.put(x,hm.getOrDefault(x,0)+1);
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