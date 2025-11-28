/*
    ProblemStatement:
    Consider Array of n elements, find frequency of each element.
    Print all the elements that occurs atleast  2 times 9
*/
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
class FreqGreaterThanTwo{
    static void freq(int arr[]){
        LinkedHashMap<Integer,Integer> res = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(res.containsKey(arr[i]))
                res.put(arr[i],res.get(arr[i])+1);
            else    
                res.put(arr[i],1);
        }
        Set<Integer> s = res.keySet();
        for(Integer i : s){
            if(res.get(i)>=2)
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


