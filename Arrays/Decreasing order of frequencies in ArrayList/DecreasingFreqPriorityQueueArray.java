/*
    ProblemStatement:
    Given array of n integers, sort them based decreasing order of frequency
    Using HashMap, Max PriorityQueue , and Array.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
class Sort implements Comparator<int[]>{
    public int compare(int[] a,int[] b){
        if(a[0]!=b[0])
            return b[0]-a[0]; 
        return a[1]-b[1];
    }
}
class DecreasingFreqPriorityQueueArray{
    public static int[] SortByFreq(int arr[],int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<int[]> f = new PriorityQueue<>(new Sort());
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            int[] t = new int[2];
            t[0]=e.getValue();
            t[1]=e.getKey();
            f.add(t);
        }
        int[] ans = new int[n];
        ArrayList<Integer> res = new ArrayList<>();
        while(!f.isEmpty()){
            int[] obj = f.poll();
            int c = obj[0];
            int x = obj[1];
            for(int j=0;j<c;j++){
                res.add(x);
            }
        }
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[]  res = SortByFreq(arr,n);
        for(Integer i : res){
            System.out.print(i+" ");
        } 
    }
}
