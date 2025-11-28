/*
    ProblemStatement:
    Given an Array of n non-negative integers where each each integer represents height of a bar in the
    elevation map.The width of each bar is 1 only.Now compute amount of water trapped between the bars
    after it rains. - using Two Arrays.
    Input:
    n = 5
    [3,0,2,0,4]
    Output:
    7
*/
import java.util.Scanner;
public class TrappingRainWaterTwoArrays {
    static int trap(int[] height,int n){
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int l = -1;
        int r = -1;
        for(int i=0;i<n;i++){
            lmax[i] = Math.max(l,height[i]);
            l = lmax[i];
        } 
        for(int i=n-1;i>=0;i--){
            rmax[i] = Math.max(r,height[i]);
            r = rmax[i];
        } 
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = Math.min(lmax[i],rmax[i]) - height[i];
        }
        int water = 0;
        for(int i=0;i<n;i++){
            water += res[i];
        }
        return water;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = trap(arr,n);
        System.out.println(res);
    }
}
