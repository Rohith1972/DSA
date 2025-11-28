/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now return count
    of triplets where sum of elements equals to target. - Using Hashing
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    3
*/
import java.util.HashSet;
import java.util.Scanner;
class ThreeSumHashing{
    static int threeSum(int[] arr,int n,int target){
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int complement = target - (arr[i]+arr[j]);
                if(hs.contains(complement))
                    count++;
                hs.add(arr[j]);
            }
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
        int res = threeSum(arr,n,target);
        System.out.println(res);
    }
}