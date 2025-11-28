/*
    Given an array of n elements, where n is always odd(2m+1). All the elements in array occurs exactly 
    2 times but 1 element occurs only one. Find that element - Using HashMap.
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
class SingleRepHashMap {
    static int findSingle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> st = map.keySet();
        for(Integer i : st){
            if(map.get(i)==1)
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
