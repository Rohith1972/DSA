import java.util.Scanner;
public class ArraySquareSort {
    static int[] squareSort(int[] arr,int n){
        int i=0,j=n-1,k=n-1;
        int[] res = new int[n];
        while(i<=j){
            int x = arr[i]*arr[i];
            int y = arr[j]*arr[j];
            if(x>y){
                res[k--] = x;
                i++;
            }
            else{
                res[k--] = y;
                j--;
            }
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
        int[] res = squareSort(arr,n);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
