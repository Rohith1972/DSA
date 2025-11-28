/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Linear Search algorithm if exits return true else return false.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    true
*/
import java.util.Scanner;
class LinearSearchReturnBoolean{
    static boolean linearSearch(int[] arr,int n ,int target){
        for(int i=0;i<n;i++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean index = linearSearch(arr,n,target);
        System.out.println(index);
    }
}