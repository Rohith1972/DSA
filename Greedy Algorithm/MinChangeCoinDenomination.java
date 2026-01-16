/*
    ProblemStatement:
    Given an amount v. Now we need to provide change for v with the following denominations in Indian
    currency {1,2,5,10,20,50,100,200,500,2000}. We have infinite supply of each coin in the above
    denomination. Now find minimum number of coins tomake the change for v.
0   Input:
    v = 43
    Output:
    4
    TimeComplexity: O(1)
    SpaceComplexity:O(1)
*/
import java.util.Scanner;
public class MinChangeCoinDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[] denominations = {1,2,5,10,20,50,100,200,500,2000};
        int res = minCoins(denominations,v);
        System.out.println(res);
    }
    static int minCoins(int[] denominations,int v){
        int res = 0;
        int n = denominations.length;
        for(int i=n-1;i>=0;i--){
            res += v/denominations[i];
            v %= denominations[i];
        }
        return res;
    }
}
