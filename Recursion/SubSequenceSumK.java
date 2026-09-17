import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class LcsSumK{
    static void printLCS(int index,int[] arr,List<Integer> list,int sum,int k){
        if(index==arr.length){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        printLCS(index+1, arr, list,sum+arr[index],k);
        list.remove(list.size()-1);
        printLCS(index+1, arr, list,sum,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        printLCS(0,arr,new ArrayList<Integer>(),0,k);
    }
}