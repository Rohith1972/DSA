/*
    ProblemStatement:
    There is staircase with n steps of stairs , a lady standing before the staircase at bottom want to
    reach the top. She can climb either 1 stair or 2 stairs at a time , now count the no.of ways in which
    she can climb the stairs. Dynamic programming Memorization method.
    Input:
    n = 4
    Output:
    5
    TimeComplexity: O(n)
    SpaceComplexity: O(n)
*/

import java.util.Scanner;

public class WaysToReachNthStairMemorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countWays(n);
        System.out.println(res);
    }
    static int countWays(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return countWays(n-1)+countWays(n-2);
    }
}
