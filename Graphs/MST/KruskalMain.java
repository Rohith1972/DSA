import java.util.Arrays;
import java.util.Scanner;

class KruskalMain{
    static int parent[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int edges[][] = new int[E][3];
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        int res = kruskalMST(V,edges);
        System.out.println(res);
    }
    static int kruskalMST(int V , int[][] edges){
        parent = new int[V];
        for(int i=0;i<V;i++)
            parent[i] = i;
        Arrays.sort(edges,(x,y)->x[2]-y[2]);
        int cost = 0;
        int count = 0;
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            int w = edges[i][2];
            int x1 = find(x);
            int y1 = find(y);
            if(x1!=y1){
                union(x,y);
                cost = cost+w;
                count++;
                if(count==V-1)
                    break;
            }
        }
        return cost;
    }
    static int find(int i){
        if(parent[i] == i)
            return i;
        return find(parent[i]);
    }
    static void union(int x,int y){
        int x1 = find(x);
        int y1 = find(y);
        if(x1!=y1){
            parent[x1] = y1;
        }
    }
}