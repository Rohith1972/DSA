import java.util.Scanner;
class FibonacciTabulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibn(n);
        System.out.println(res);
    }
    static int fibn(int n){
        int dp[] = new int[n+1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}