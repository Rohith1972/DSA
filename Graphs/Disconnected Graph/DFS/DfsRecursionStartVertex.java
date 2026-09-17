/*
    ProblemStatement:
    Implement DepthFirstSearch(DFS) on graph using adjacency matrix.
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
import java.util.List;
import java.util.Scanner;
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
    List<Integer> DFS(int start){
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        DFS1(start,visited,res);
        for(int i=0;i<n;i++){
            if(!visited[i])
                DFS1(i,visited,res);
        }
        return res;
    }
    public void DFS1(int s ,boolean visited[],List<Integer> res){
        res.add(s);
        visited[s] = true;
        for(int i=0;i<n;i++){
            if(!visited[i] && M[s][i] == 1){
                DFS1(i,visited,res);
            }
        }
    }
}
class DfsRecursionStartVertex{
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
        int start = sc.nextInt();
        List<Integer> res = g.DFS(start);
        for(Integer i : res){
            System.out.print(i+" ");
        }
    }
}