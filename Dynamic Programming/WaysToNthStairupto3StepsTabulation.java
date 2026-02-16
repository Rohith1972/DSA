/*
    ProblemStatement:
    There is staircase with n steps of stairs , a lady standing before the staircase at bottom want to
    reach the top. She can climb either 1 stair or 2 stairs at a time , now count the no.of ways in which
    she can climb the stairs. Dynamic Programming Tabulation method.
    Input:
    n = 4
    Output:
    5
    TimeComplexity: O(n)
    SpaceComplexity: O(n)
*/

import java.util.Scanner;

public class WaysToNthStairupto3StepsTabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countWays(n);
        System.out.println(res);
    }
    static int countWays(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
