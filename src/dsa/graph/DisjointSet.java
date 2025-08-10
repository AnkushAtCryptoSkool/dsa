package src.dsa.graph;

public class DisjointSet {
    int parent[];
    int rank[];
    int components;

    DisjointSet(int node){
        parent = new int[node];
        rank = new int[node];
        components = node;
        for(int i=0;i<node;i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int getParent(int node){
        if(node == parent[node]){
            return node;
        }
        parent[node] = getParent(parent[node]);
        return parent[node];
    }

    public void unionByRank(int n1,int n2){
        int rootParent1 = getParent(n1);
        int rootParent2 = getParent(n2);
        if(rootParent1 == rootParent2) return ;
        components--;
        if(rank[rootParent1] < rank[rootParent2]){
            parent[rootParent1] = rootParent2;
        } else if(rank[rootParent2] < rank[rootParent1]){
            parent[rootParent2] = rootParent1;
        }else{
            parent[rootParent2] = rootParent1;
            rank[rootParent1]++;
        }
    }

    public static void main(String[] args) {
        DisjointSet dsu = new DisjointSet(4);
        System.out.println("Total no of components : " + dsu.components);
        System.out.println("Parent of 0 -> " + dsu.getParent(0));
        System.out.println("Parent of 3 -> " + dsu.getParent(3));
        dsu.unionByRank(0,3);
        System.out.println("Total no of components : " + dsu.components);
        System.out.println("Parent of 0 -> " + dsu.getParent(0));
        System.out.println("Parent of 3 -> " + dsu.getParent(3));
    }
}
