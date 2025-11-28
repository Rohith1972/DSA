import java.util.*;
/*
Problem 4: Two Sum Zero (Sorted Data) — Verify Pair Exists
Given a sorted array, check whether any two elements sum to zero.
Input:
- First line: n -> size
- Second line: n space-separated integers (sorted)
Output:
- Print "YES" if pair exists, otherwise "NO"
*/
// 4.3 Hashing
class TwoSumZeroSortedHashing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
          arr[i]=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        boolean found=false;
        for(int x:arr){
            if(set.contains(-x)){found=true; break;}
            set.add(x);
        }
        System.out.println(found?"YES":"NO");
    }
}


