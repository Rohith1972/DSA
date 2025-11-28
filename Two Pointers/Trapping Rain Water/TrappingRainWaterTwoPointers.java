/*
    ProblemStatement:
    Given an Array of n non-negative integers where each each integer represents height of a bar in the
    elevation map.The width of each bar is 1 only.Now compute amount of water trapped between the bars
    after it rains. - using Two Pointers.
    Input:
    n = 5
    [3,0,2,0,4]
    Output:
    7
*/
import java.util.Scanner;
public class TrappingRainWaterTwoPointers {
    static int trap(int[] height,int n){
        int left=0,right = n-1;
        int leftMax =0,rightMax =0;
        int water = 0;
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }else{
                    water += leftMax-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax = height[right];
                }else{
                    water += rightMax-height[right];
                }
                right--;
            }
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
