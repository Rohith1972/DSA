/*
    ProblemStatement:
    Given an integer, find and return its prime factors and their power using TreeMap.
*/
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class PrimeFactorsPowTreeMap{
    static TreeMap<Integer,Integer> primeFactors(int n){
        TreeMap<Integer,Integer> res = new TreeMap<>();
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
        TreeMap<Integer,Integer> res = primeFactors(num);
        Set<Integer> set = res.keySet();
        for(Integer i : set){
            System.out.println(i+" : "+res.get(i));
        }
    }
}


