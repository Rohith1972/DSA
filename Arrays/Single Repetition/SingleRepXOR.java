/*
    Given an array of n elements, where n is always odd(2m+1). All the elements in array occurs exactly 
    2 times but 1 element occurs only one. Find that element - Using XOR Operation.
*/
import java.util.Scanner;
class SingleRepXOR {
    static int findSingle(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSingle(arr)); 
    }
}
