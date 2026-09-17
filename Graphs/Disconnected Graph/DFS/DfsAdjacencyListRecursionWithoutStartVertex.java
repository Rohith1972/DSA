import java.util.ArrayList;
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
    public java.util.List<Integer> dfs(){
        java.util.List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
                dfs1(i,visited,res);
        }
        return res;
    }
    public void dfs1(int s,boolean[] visited,java.util.List<Integer> res){
        res.add(s);
        visited[s] = true;
        for(int i : M.get(s)){
            if(!visited[i]){
                dfs1(i,visited,res);
            }
        }
    }
}
public class DfsAdjacencyListRecursionWithoutStartVertex {
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
        java.util.List<Integer> res = g.dfs();
        System.out.println(res);
    }
}
