import java.util.ArrayList;
import java.util.Scanner;

class KadanesAlgorithm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = kadanes(arr,n);
        System.out.println(res);
    }
    static ArrayList<Integer> kadanes(int[] arr,int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum += arr[i];
            res.add(arr[i]);
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
                res.clear();
            }
        } 
        System.out.println(maxSum);
        return res;
    }
}