/*
    ProblemStatement:
    Given an Array of n integers which are distinct and unsorted. we also given target now return 
    all triplets where sum of elements equals to target if not exists return [-1,1,-1].-Using TwoPointers
    approach.
    Input:
    n=8
    [2,6,3,9,12,5,1,15]
    Output:
    [1,2,15]
    [1,5,12]
    [3,6,9]
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class ThreeSumTwoPointers{
    static ArrayList<int[]> threeSum(int[] arr,int n,int target){
        Arrays.sort(arr);
        ArrayList<int[]> res1 = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int l=i+1,h=n-1;
            while(l<h){
                int sum =arr[i]+arr[l]+arr[h] ;
                if(sum == target){
                    int[] res = new int[3];
                    res[0] = arr[i];
                    res[1] = arr[l];
                    res[2] = arr[h];
                    res1.add(res);
                    l++;
                    h--;
                }else if(sum<target){
                    l++;
                }else{
                    h--;
                }
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