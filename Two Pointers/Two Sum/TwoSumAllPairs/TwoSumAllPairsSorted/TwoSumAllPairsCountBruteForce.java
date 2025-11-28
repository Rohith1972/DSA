/*
    ProblemStatement:
    You are given an array of n integers which are distinct and sorted. Now, we are also given a
    target. Find and return count of all pairs where sum equals to target. using brute force technique.
    Input:
    n = 8
    [6,1,3,5,4,7,2,12]
    target:9
    Output:
    3
*/

import java.util.Scanner;
class TwoSumAllPairsCountBruteForce{
    static int  findAllPairs(int[] arr,int target,int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }
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
        int res = findAllPairs(arr,target,n);
        System.out.println(res);
    }
}