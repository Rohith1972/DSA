import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Graph{
    int n;
    int[][] M;
    Graph(int n){
        this.n = n;
        M = new int[n][n];
    }
    public void addEdge(int u,int v){
        M[u][v] = 1;
        M[v][u] = 1;
    }
    public void display(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    List<Integer> DFS(){
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
                DFS1(i,visited,res);
        }
        return res;
    }
    public void DFS1(int s ,boolean visited[],List<Integer> res){
        Stack<Integer> st = new Stack<>();
        st.push(s);
        visited[s] = true;
        while(!st.isEmpty()){
            int curr = st.pop();
            res.add(curr);
            for(int i=0;i<n;i++){
                if(!visited[i] && M[curr][i] == 1){
                    st.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}
class DfsWithoutRecursionWithoutStartVertex{
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
        java.util.List<Integer> res = g.DFS();
        System.out.println(res);
    }
}