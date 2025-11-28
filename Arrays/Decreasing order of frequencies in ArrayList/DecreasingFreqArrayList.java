/*
    ProblemStatement:
    Given array of n integers, sort them based decreasing order of frequency
    Using HashMap, ArrayList and sorting
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Sort implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
        if(!a.get(0).equals(b.get(0)))
            return b.get(0)-a.get(0); 
        return a.get(1)-b.get(1);
    }
}
class DecreasingFreqArrayList{
    public static ArrayList<Integer> SortByFreq(int arr[],int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<ArrayList<Integer>> f = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(e.getValue());
            t.add(e.getKey());
            f.add(t);
        }
        Collections.sort(f,new Sort());
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<f.size();i++){
            int c = f.get(i).get(0);
            int x = f.get(i).get(1);
            for(int j=0;j<c;j++){
                res.add(x);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>  res = SortByFreq(arr,n);
        for(Integer i : res){
            System.out.print(i+" ");
        } 
    }
}