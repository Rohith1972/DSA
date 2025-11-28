import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
class RemoveDups3{
    static void freq(int arr[]){
        TreeSet<Integer> res = new TreeSet<>();
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
