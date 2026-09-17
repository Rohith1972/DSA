import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Graph{
    int n;
    HashMap<Integer,ArrayList<Integer>> M;
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
}
public class GraphAdjacencyListHashMap {
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
    }
}
