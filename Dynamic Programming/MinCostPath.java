class MinCostPath{
    static int minCostPath(int m,int n,int cost[][]){
        int res[][] = new int[m][n];
        res[0][0] = cost[0][0];
        for(int i=1;i<m;i++){
            res[0][i] = res[0][i-1];
        }
        for(int i=1;i<n;i++){
            res[i][0] = res[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                res[i][j] = Math.min(res[i-1][j-1],Math.min(res[i-1][j],res[i][j-1]))+cost[i][j];
            }
        }
        return res[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int cost[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cost[i][j] = sc.nextInt();
            }
        }
        int res = minCostPath(m,n,cost);
        System.out.println(res);
    }
}