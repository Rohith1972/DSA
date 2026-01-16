/*
    ProblemStatement:
    You are given an Array of n integers . Find and return first negative element in each subArray if no
    negative element in subArray place it as 0 . Solve the above problem using sliding window approach.
    Input:
    arr = [-6,1,2,3,-5]
    k = 3
    Output:
    res = [-6,0,-5]
    TimeComplexity:
    SpaceComplexity: 
*/
import java.util.Scanner;
class FirstNegativeElementInEachSubArraySlidingWindows{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = firstNegative(arr,n,k);
        for(Integer x : res){
            System.out.print(x + " ");
        }
    }
    public static int[] firstNegative(int[] arr,int n,int k){
        int res[] = new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
}