class Pair{
    int node;
    int cost;
    public Pair(int node,int cost){
        this.node=node;
        this.cost=cost;
    }
}
class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,2*w));
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int cost = curr.cost;

            if(cost>dist[node]) continue;
            if(node==n-1) return cost;
            for(Pair it:adj.get(node)){
                if(cost+it.cost<dist[it.node]){
                    dist[it.node]=cost+it.cost;
                    pq.add(new Pair(it.node,dist[it.node]));
                }
            }
        }
        return -1;
    }
}