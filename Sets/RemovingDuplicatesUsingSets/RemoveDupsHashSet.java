/*
    ProblemStatement:
    Consider Array of n elements, remove duplicates
    Output can be in any order. 
*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
class RemoveDupsHashSet{
    static void freq(int arr[]){
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        Iterator<Integer> i = res.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
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