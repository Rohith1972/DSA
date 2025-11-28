/*
    Given an array of n elements, where n is always odd(2m+1). All the elements in array occurs exactly 
    2 times but 1 element occurs only one. Find that element - Using FrequencyArray.
*/
import java.util.Scanner;
class SingleRepFreqArray {
    static int findSingle(int[] arr) {
        int max = 0;
        for (int num : arr){
            max = Math.max(max, num);
        }
        int[] freq = new int[max + 1];
        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) 
                return i;
        }
        return -1;
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
