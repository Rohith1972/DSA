/*
    ProblemStatement:
    Implement DepthFirstSearch(DFS) on graph using adjacency list.
    Input:
    3
    3
    0 1
    0 2
    1 2
    Output:
    0 1 2
*/
import java.util.ArrayList;
import java.util.Scanner;
class Graph{
    int V;
    ArrayList<ArrayList<Integer>> adjMatrix;
    Graph(int V){
        this.V=V;
        adjMatrix = new ArrayList<>(V);
        
    }
    void addEdge(int u,int v){
        adjMatrix.get(u).add(v);
        adjMatrix.get(v).add(u);
    }
    void dfs(int start,boolean[] visited){
        visited[start] = true;
        System.out.print(start+" ");
        for(int x:adjMatrix.get(start)){
            if(visited[x] == false){
                dfs(x,visited);
            }
        }
    }
}
class DfsAdjacencyList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        int nEdges = sc.nextInt();
        for(int i=0;i<nEdges;i++){
            int[] edge = new int[2];
            edge[0] = sc.nextInt();
            edge[1] = sc.nextInt();
            g.addEdge(edge[0],edge[1]);
        }
        boolean[] visited = new boolean[n];
        g.dfs(0, visited);
    }
}
