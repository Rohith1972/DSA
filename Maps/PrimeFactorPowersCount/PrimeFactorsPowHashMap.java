/*
    ProblemStatement:
    Given an integer, find and return its prime factors and their power using HashMap.
*/
import java.util.HashMap;
import java.util.Scanner;
public class PrimeFactorsPowHashMap {
    static HashMap<Integer,Integer> primeFactors(int n){
        HashMap<Integer,Integer> res = new HashMap<>();
        int count = 0;
        while(n%2==0){
            count++;
            n/=2;
        }
        res.put(2,count);
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                count++;
                n/=i;
            }
            res.put(i,count);
            count=0;
        }
        if(n>1)
            res.put(n,1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<Integer,Integer> res = primeFactors(num);
        System.out.println(res);
    }
}
