/*
    ProblemStatement:
    Given a array of n integers and a target , Check whether the target is present in the given Array
    or not using Linear Search algorithm if exits return the index else return -1.
    Input:
    n = 5
    [1,3,4,2,5]
    target = 5
    Output:
    4
*/
import java.util.Scanner;
class LinearSearchReturnIndex{
    static int linearSearch(int[] arr,int n ,int target){
        for(int i=0;i<n;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = linearSearch(arr,n,target);
        System.out.println(index);
    }
}