/*
    ProblemStatement:
    Given an Arrays of n Integers each integer in the Array represents the time taken by a task to complete
    You are given time limit or threshold. Now find max no.of tasks to complete within the given time limit.
    Input:
    n = 6
    t = 6
    arr[] = {2,3,5,1,4,8}
    Output:
    3
    TimeComplexity: O(nlogn)
    SpaceComplexity:O(1)
*/
import java.util.Arrays;
import java.util.Scanner;
class MaxTasksToCompleteWithinTime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = maxTasks(arr,n,t);
        System.out.println(res);
    }
    static int maxTasks(int[] arr,int n,int t){
        Arrays.sort(arr);
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<=t){
                res++;
                t-=arr[i];
            }else{
                break;
            }
        }
        return res;
    }
}