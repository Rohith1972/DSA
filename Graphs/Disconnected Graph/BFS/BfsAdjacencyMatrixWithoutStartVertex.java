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
import java.util.LinkedList;
import java.util.Queue;
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
    java.util.List<Integer> bfs(){
        java.util.List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs1(i,visited,res);
            }
        }
        return res;
    }
    public java.util.List<Integer> bfs1(int s ,boolean visited[],java.util.List<Integer> res){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int i=0;i<n;i++){
                if(!visited[i] && M[curr][i] == 1){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
        return res;
    }
}
class BfsAdjacencyMatrixWithoutStartVertex{
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