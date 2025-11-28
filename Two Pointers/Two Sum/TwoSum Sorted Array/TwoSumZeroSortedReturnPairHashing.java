import java.util.*;
/*
Problem 5: Two Sum Zero (Sorted Data) — Return Pair
Return any pair whose sum is zero. If no pair exists, print -1 -1
*/
// 5.3 Hashing
class TwoSumZeroSortedReturnPairHashing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
           arr[i]=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        int a=-1,b=-1;
        for(int x:arr){
            if(set.contains(-x)){
                a=-x;b=x;
                  break;}
            set.add(x);
        }
        System.out.println(a+" "+b);
    }
}

