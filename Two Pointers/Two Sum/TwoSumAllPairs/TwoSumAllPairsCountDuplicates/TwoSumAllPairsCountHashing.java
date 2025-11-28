/*
    ProblemStatement:
    You are given an array of n integers which are distinct and unsorted. Now, we are also given a
    target. Find and return count of all pairs where sum equals to target. using Hashing technique.
    Input:
    n = 8
    [6,1,3,5,4,7,2,12]
    target:9
    Output:
    6
*/
import java.util.HashMap;
import java.util.Scanner;
class TwoSumAllPairsCountHashing{
    static int findAllPairs(int[] arr,int target,int n){
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = arr[i];
            int x1 = target - arr[i];
            if(hm.containsKey(x1)){
                count+=hm.get(x1);
            }
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = findAllPairs(arr,target,n);
        System.out.println(res);
    }
}