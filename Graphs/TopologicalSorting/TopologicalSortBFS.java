import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
class Graph{
    int n;
    List<List<Integer>> M;
    Graph(int n){
        this.n = n;
        M = new ArrayList<>();
        for(int i=0;i<n;i++){
            M.add(new ArrayList<>());
        }
    } 
    void addEdge(int u,int v){
        M.get(u).add(v);
    }
    void display(){
        System.out.println(M);
    }
    List<Integer> topoSort(){
        int[] ind = new int[n];
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int x:M.get(i)){
                ind[x]++;
            }
        }
        for(int i=0;i<n;i++){
            if(ind[i]==0)
                q.add(i);
        }
        while(!q.isEmpty()){
            int x1 = q.poll();
            res.add(x1);
            for(int i:M.get(x1)){
                ind[i]--;
                if(ind[i]==0)
                    q.add(i);
            }
        }
        return res;
    }
}
public class TopologicalSortBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        while(true){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u,v);
            int ch = sc.nextInt();
            if(ch==-1)
                break;
        }
        g.display();
        List<Integer> res = g.topoSort();
        System.out.println(res);
    }
}
