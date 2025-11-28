/*
    ProblemStatement:
    You are given an Array of n elements and also another element k.
    Now find top K frequent occurring elements from Array.
    If two elements have the same frequency then larger element comes first.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Sort implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (!a.get(0).equals(b.get(0))) {
            return b.get(0) - a.get(0); 
        }
        return b.get(1) - a.get(1); 
    }
}
class TopKFrequency {
    public static ArrayList<Integer> SortByFreq(int arr[], int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<ArrayList<Integer>> f = new PriorityQueue<>(new Sort());
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(e.getValue()); 
            t.add(e.getKey());   
            f.add(t);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        while (count < k && !f.isEmpty()) {
            ArrayList<Integer> obj = f.poll();
            if (obj != null) {
                res.add(obj.get(1)); 
                count++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> res = SortByFreq(arr, n, k);
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }
}
