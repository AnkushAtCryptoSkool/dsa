package src.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphV1 {

    class Pair{
        int node;
        int weight;
        Pair(int n,int w){

        }

    }
    int adjacencyMatrix[][];
    List<List<Integer>> adjList;

    GraphV1(int nodes){
        adjacencyMatrix = new int[nodes][nodes];
       adjList = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesToGraph(int[][] edges, boolean directed){
        for( int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            if(directed){
                adjacencyMatrix[u][v] = 1;
            }else{
                adjacencyMatrix[u][v] = 1;
                adjacencyMatrix[v][u] = 1;
            }
        }
    }
    public void addEdgesToAdjList(int[][] edges, boolean directed){
        for( int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            if(directed){
                adjList.get(u).add(v);
            }else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgesToGraphWithWeights(int[][] edges, boolean directed){
        for( int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if(directed){
                adjacencyMatrix[u][v] = w;
            }else{
                adjacencyMatrix[u][v] = w;
                adjacencyMatrix[v][u] = w;
            }
        }
    }

    public void printGraph(){
        for (int i=0;i<adjacencyMatrix.length;i++){
            System.out.print("In row ---> " + i + " ---> ");
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void printAdjList(){
        for (int i=0;i<adjList.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
          for (int j = 0; j < adjList.get(i).size(); j++) {
              System.out.print(adjList.get(i).get(j));
              if(j != adjList.get(i).size() - 1){
                  System.out.print( ", ");
              }
          }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0,1},{2,0},{1,2}};
        withoutWeightGraps(edges);
        int edgesWithWeights[][] = {{1,0,10},{2,0,20},{1,2,30}};
        withWeightGraps(edgesWithWeights);
        System.out.println("----------  Printing List -----------");
        withoutWeightList(edges);
    }

    private static void withoutWeightGraps(int[][] edges) {
        int nodes = edges.length;
        GraphV1 graph = new GraphV1(nodes);
        graph.addEdgesToGraph(edges,true);
        System.out.println("Printing directed Graph");
        graph.printGraph();

        GraphV1 graph1 = new GraphV1(nodes);
        graph1.addEdgesToGraph(edges,false);
        System.out.println("Printing undirected Graph");
        graph1.printGraph();
    }

    private static void withoutWeightList(int[][] edges) {
        int nodes = edges.length;
        GraphV1 graph = new GraphV1(nodes);
        graph.addEdgesToAdjList(edges,true);
        System.out.println("Printing directed List");
        graph.printAdjList();

        GraphV1 graph1 = new GraphV1(nodes);
        graph1.addEdgesToAdjList(edges,false);
        System.out.println("Printing undirected List");
        graph1.printAdjList();
    }

    private static void withWeightGraps(int[][] edges) {
        int nodes = edges.length;
        GraphV1 graph = new GraphV1(nodes);
        graph.addEdgesToGraphWithWeights(edges,true);
        System.out.println("Printing directed Graph");
        graph.printGraph();

        GraphV1 graph1 = new GraphV1(nodes);
        graph1.addEdgesToGraphWithWeights(edges,false);
        System.out.println("Printing undirected Graph");
        graph1.printGraph();
    }
}
