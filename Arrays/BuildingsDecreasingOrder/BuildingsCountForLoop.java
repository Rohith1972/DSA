/*
    Count of no of buildings facing sun- 2 methods 
    Using simple for loop
*/
import java.util.Scanner;
class BuildingsCountForLoop{
    static int count(int[] arr,int n){
        int max = arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                count++;
                max = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = count(arr,n);
        System.out.println(res);
    }
}
