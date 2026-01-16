import java.util.Scanner;
class CountSubArraysTargetBruteForce{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long target = sc.nextLong();
        long count = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target) count++;
            }
        }
        System.out.println(count);
        sc.close();

















































        
    }
}