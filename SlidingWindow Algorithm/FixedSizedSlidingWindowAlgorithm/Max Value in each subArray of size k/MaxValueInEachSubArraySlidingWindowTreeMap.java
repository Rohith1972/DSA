/*
    ProblemStatement:
    You are given an Array of n integers also k . Now find and return Max element in each subArray 
    of size k using SlidingWindow and TreeMap.
    Input:
    n = 8
    k = 3
    a[] = [10,50,60,80,90,100,20,60]
    Output:
    res[] = [60,80,90,100,100,100]
    TimeComplexity:O(nlogn)
    SpaceComplexity:O(n-k+1) 
*/
import java.util.Scanner;
import java.util.TreeMap;
class MaxValueInEachSubArraySlidingWindowTreeMap{
    public static int[] subArrays(int[] arr,int n,int k){
        int res[] = new int[n-k+1];
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        int left = 0;
        for(int right=0;right<n;right++){
            tm.put(arr[right],tm.getOrDefault(arr[right],0)+1);

            if(right-left+1 == k){
                
                res[left] = tm.lastKey();

                int count = tm.get(arr[left]);
                if(count == 1){
                    tm.remove(arr[left]);
                }else{
                    tm.put(arr[left], count-1);
                }
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res[] = subArrays(arr,n,k);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i] + " ");
    }
}