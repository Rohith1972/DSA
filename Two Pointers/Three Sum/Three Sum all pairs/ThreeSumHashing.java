/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now  return all
    triplets where sum of elements equals to target is not exits return [-1,-1,-1]. - Using Hashing
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    [2,15,1]
    [6,3,9]
    [12,1,5]
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class ThreeSumHashing{
    static ArrayList<int[]> threeSum(int[] arr,int n,int target){
        ArrayList<int[]> res1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int complement = target - (arr[i]+arr[j]);
                if(hs.contains(complement)){
                    int[] res = new int[3];
                    res[0] = arr[i];
                    res[1] = arr[j];
                    res[2] = complement;
                    res1.add(res);
                }
                hs.add(arr[j]);
            }
        }
        return res1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<int[]> res = threeSum(arr,n,target);
        for(int i=0;i<res.size();i++){
            int[] t = res.get(i);
            for(int num : t){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}