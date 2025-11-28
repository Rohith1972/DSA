/*
    ProblemStatement:
    You are given an Array of n integer which are sorted , and a target . Now find the count of all the Occurances 
    of the target in the Array.
    Input:
    8
    [1,1,2,2,2,2,3,3]
    2
    Output:
    4
*/
import java.util.Scanner;
public class LinearSearchCountAllOccurences {
    static int countOccurances(int[] arr,int n,int target){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == target)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = countOccurances(arr,n,target);
        System.out.println(count);
    }
}
