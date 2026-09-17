import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Dsu{
    int n;
    int parent[];
    Dsu(int n){
        this.n = n;
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }
    }
    int find(int i){
        if(parent[i] == i)
            return i;
        return find(parent[i]);
    }
    void union(int i,int j){
        int i1 = find(i);
        int j1 = find(j);
        if(i1 != j1)
            parent[i1] = j1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dsu dsu = new Dsu(n);
        while(true){
                System.out.println("1.Add Relation\n2.Find Friends or not\n3.No.of Groups\n4.Find members in Groups\n5.Exit");
                int num = sc.nextInt();
                switch(num){
                case 1 :    int i = sc.nextInt();
                            int j = sc.nextInt();
                            dsu.union(i,j);
                            System.out.println("Relation Added!");
                            break;
                case 2 :    int p = sc.nextInt();
                            int q = sc.nextInt();
                            if(dsu.find(p)==dsu.find(q))
                                System.out.println("Friendship relation found!");
                            else
                                System.out.println("Not Friends!");
                            break;
                case 3 :    HashSet<Integer> hs = new HashSet<>();
                            hs.clear();
                            for(int a=0;a<n;a++){
                                if(!hs.contains(dsu.find(dsu.parent[a])))
                                    hs.add(dsu.parent[a]);
                            }
                            System.out.println(hs.size());
                            break;
                case 4 :    Map<Integer,List<Integer>> map = new HashMap<>();
                            for(int b=0;b<n;b++){
                                int root = dsu.find(b);
                                map.putIfAbsent(root, new ArrayList<>());
                                map.get(root).add(b);
                            }
                            for(Map.Entry<Integer, List<Integer>> e : map.entrySet())
                            {
                                System.out.println(e.getValue() + " ");
                            }
                            break;
                case 5 : System.exit(0);
            }
        }
    }
}