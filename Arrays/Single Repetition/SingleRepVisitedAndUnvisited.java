/*
    Given an array of n elements, where n is always odd(2m+1). All the elements in array occurs exactly 
    2 times but 1 element occurs only one. Find that element - Using visited and unvisited approach.
*/
import java.util.Scanner;
class SingleRepVisitedAndUnvisited{
    static int findSingle(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            boolean foundPair = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    foundPair = true;
                    break;
                }
            }
            if (!foundPair) return arr[i];
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
