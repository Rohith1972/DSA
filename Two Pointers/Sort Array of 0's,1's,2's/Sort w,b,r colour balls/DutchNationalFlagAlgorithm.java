/*
    ProblemStatement:
    We are given an array of n elements which are w's, b's, r's. Now sort the elements and 
    return array. Using Dutch National Flag Algorithm.
    input:
    5
    [r,r,b,w,w]
    output:
    [w,w,b,r,r]
*/
import java.util.Scanner;
public class DutchNationalFlagAlgorithm {
    static char[] dnf(char[] arr,int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]=='w'){
                char temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;mid++;
            }else if(arr[mid]=='b')
                mid++;
            else{
                char temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
        char[] res = dnf(arr,n);
        for(char i : res){
            System.out.print(i+" ");
        }
    }
}
