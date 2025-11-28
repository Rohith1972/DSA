import java.util.*;
/*
Problem 6: Two Sum Zero (Sorted Data) — Return Indices
Return 0-based indices of a pair whose sum is zero. If no pair exists, return -1 -1
*/
// 6.3 Hashing
class TwoSumZeroSortedReturnIndicesHashing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
           arr[i]=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i1=-1,i2=-1;
        for(int i=0;i<n;i++){
            if(map.containsKey(-arr[i])){
                i1=map.get(-arr[i]);
                  i2=i;
                   break;
        }
            map.put(arr[i],i);
        }
        System.out.println(i1+" "+i2);
    }
}

