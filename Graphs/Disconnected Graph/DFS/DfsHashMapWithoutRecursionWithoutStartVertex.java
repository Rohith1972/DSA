import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Graph{
    int n;
    HashMap<Integer,List<Integer>> M;
    Graph(int n){
        this.n = n;
        M = new HashMap<>();
        for(int i=0;i<n;i++){
            M.put(i,new ArrayList<>());
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
        boolean[] visited = new boolean[n];
        java.util.List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs1(i,visited,res);
            }
        }
        return res;
    }
    public void dfs1(int s,boolean[] visited,java.util.List<Integer> res){
        Stack<Integer> st = new Stack<>();
        st.push(s);
        visited[s] = true;
        while(!st.isEmpty()){
            int curr = st.pop();
            res.add(curr);
            for(int i:M.get(curr)){
                if(!visited[i]){
                    st.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}
public class DfsHashMapWithoutRecursionWithoutStartVertex {
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
