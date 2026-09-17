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
    }
    public void display(){
        System.out.println(M);
    }
    public java.util.List<Integer> topoSort(int s,boolean[] visited){
        java.util.List<Integer> res = new ArrayList<>();
        java.util.Stack<Integer> st = new java.util.Stack<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,st);
            }
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
    public void dfs(int s,boolean[] visited,java.util.Stack<Integer> st){
        visited[s] = true;
        for(int i : M.get(s)){
            if(!visited[i]){
                dfs(i,visited,st);
            }
        }
        st.push(s);
    }
}
public class TopologicalSortingDFS {
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
        java.util.List<Integer> res = g.topoSort(n, new boolean[n]);
        System.out.println(res);
    }
}
