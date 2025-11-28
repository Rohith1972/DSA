import java.util.ArrayList;
import java.util.Scanner;
class NFibos1{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = nFibo(n);
        for(Integer i : res){
            System.out.print(res.get(i)+" ");
        }
    }
    static ArrayList<Integer> nFibo(int n){
        ArrayList<Integer> res = new ArrayList<>();
        if(n==0)
            res.add(0);
        if(n==1)
            res.add(1);
        else{
            int a=0,b=1,c=0;
            res.add(0);
            res.add(1);
            for(int i=2;i<=n;i++){
                c=a+b;
                res.add(c);
                a=b;
                b=c;
            }
        }
        return res;
    }
}
