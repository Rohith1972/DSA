import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
class MapFreq1{
    static void freq(int arr[]){
        HashMap<Integer,Integer> res = new HashMap<>();
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

