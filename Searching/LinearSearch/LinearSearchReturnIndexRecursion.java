/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Linear Search algorithm if exits return the index else return -1 using recursion.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    4
*/
import java.util.Scanner;
class LinearSearchReturnIndexRecursion{
    static int linearSearch(int[] arr,int n,int i,int target){
        if(i==n){
            return -1;
        }else{
            if(arr[i] == target)
                return i;
            else    
                return linearSearch(arr,n,i+1,target);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = linearSearch(arr,n,0,target);
        System.out.println(index);
    }
}