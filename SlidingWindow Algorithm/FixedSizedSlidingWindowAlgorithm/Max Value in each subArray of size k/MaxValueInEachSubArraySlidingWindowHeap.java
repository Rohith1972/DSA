/*
    ProblemStatement:
    You are given an Array of n integers also k . Now find and return Max element in each subArray 
    of size k using SlidingWindow and Heap(PriorityQueue).
    Input:
    n = 8
    k = 3
    a[] = [10,50,60,80,90,100,20,60]
    Output:
    res[] = [60,80,90,100,100,100]
    TimeComplexity:O(nlogn)
    SpaceComplexity:O(n-k+1) 
*/
import java.util.PriorityQueue;
import java.util.Scanner;
class MaxValueInEachSubArraySlidingWindowHeap{
    public static int[] subArrays(int[] arr,int n,int k){
        int res[] = new int[n-k+1];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)-> b[0] - a[0]
        );
        for(int i=0;i<n;i++){
            pq.offer(new int[]{arr[i],i});
            while(pq.peek()[0] <= i-k){
                pq.poll(); 
            }
            if(i >= k-1){
                res[i-k+1] = pq.peek()[0];
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