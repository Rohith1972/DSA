/*
    ProblemStatement:
    Given an array of numbers ( integers) .now move all even numbers to beginning of array and all 
    odd numbers placed after even numbers. Return modified array. using Segregation method.
    Input:
    5
    [1,2,3,4,5]
    Output:
    [2,4,1,3,5]
*/
import java.util.ArrayList;
import java.util.Scanner;
class Segregation{
    static int[] segregation(int[] arr,int n){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i : arr){
            if(i%2 == 0)
                even.add(i);
            else    
                odd.add(i);
        }
        even.addAll(odd);
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i] = even.get(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = segregation(arr,n);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}