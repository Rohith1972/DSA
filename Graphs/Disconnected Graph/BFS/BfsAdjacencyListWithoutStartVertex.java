import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph{
    int n;
    ArrayList<ArrayList<Integer>> M;
    Graph(int n){
        this.n = n;
        M = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            M.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        M.get(u).add(v);
        M.get(v).add(u);
    }
    public void display(){
        System.out.println(M);
    }
    public java.util.List<Integer> bfs(){
        boolean[] visited = new boolean[n];
        java.util.List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!visited[i])
                bfs1(i,visited,res);
        }
        return res;
    }
    public void bfs1(int s,boolean[] visited,java.util.List<Integer> res){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int i : M.get(curr)){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
public class BfsAdjacencyListWithoutStartVertex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
            int ch = sc.nextInt();
            if(ch == -1){
                break;
            }
        }
        g.display();
        java.util.List<Integer> res = g.bfs();
        System.out.println(res);
    }
}
