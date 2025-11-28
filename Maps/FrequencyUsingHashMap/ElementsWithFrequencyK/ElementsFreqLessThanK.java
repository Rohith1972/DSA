/*
    ProblemStatement:
    Consider Array of n elements, remove duplicates
    Output can be in any order.
*/
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
class Freq3{
    static void freq(int arr[],int k){
        LinkedHashMap<Integer,Integer> res = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(res.containsKey(arr[i]))
                res.put(arr[i],res.get(arr[i])+1);
            else    
                res.put(arr[i],1);
        }
        Set<Integer> s = res.keySet();
        for(Integer i : s){
            if(res.get(i)<=k)
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
        int k = sc.nextInt();
        freq(arr,k);
    }
}

