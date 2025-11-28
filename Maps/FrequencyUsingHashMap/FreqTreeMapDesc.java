/*
    ProblemStatement:
    Consider Array of n elements, find frequency of each element.
    Print elements and their frequencies according to sorted  order of keys- ascending order.
*/
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class FreqTreeMapDesc{
    static void freq(int arr[]){
        TreeMap<Integer,Integer> res = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            if(res.containsKey(arr[i]))
                res.put(arr[i],res.get(arr[i])+1);
            else    
                res.put(arr[i],1);
        }
        Set<Integer> s = res.keySet();
        for(Integer i : s){
                System.out.println(i+" : "+res.get(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        freq(arr);
    }
}