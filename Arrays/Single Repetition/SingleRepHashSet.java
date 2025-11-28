/*
    Given an array of n elements, where n is always odd(2m+1). All the elements in array occurs exactly 
    2 times but 1 element occurs only one. Find that element - Using HashSet.
*/
import java.util.HashSet;
import java.util.Scanner;
class SingleRepHashSet{
    static int findSingle(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            set.add(arr[i]);
        }
        int sum1 = 0;
        for(Integer i : set){
            sum1 = sum1 + 2*i;
        }
        return sum1-sum;
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
