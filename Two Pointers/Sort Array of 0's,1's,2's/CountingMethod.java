/*
    ProblemStatement:
    We are given an array of n elements which are zeroes, ones, twos. Now sort the elements and 
    return array. Using counting method.
    input:
    5
    [2,2,0,1,1]
    output:
    [0,1,1,2,2]
*/
import java.util.ArrayList;
import java.util.Scanner;
public class CountingMethod {
    static int[] countingMethod(int[] arr,int n){
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        ArrayList<Integer> res1 = new ArrayList<>();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                zeroCount++;
            else if(arr[i]==1)
                oneCount++;
            else
                twoCount++;
        }
        for(int i=0;i<zeroCount;i++){
            res1.add(0);
        }
        for(int i=0;i<oneCount;i++){
            res1.add(1);
        }
        for(int i=0;i<twoCount;i++){
            res1.add(2);
        }
        for(int i=0;i<n;i++){
            res[i] = res1.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = countingMethod(arr,n);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
