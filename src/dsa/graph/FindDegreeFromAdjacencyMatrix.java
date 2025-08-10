package src.dsa.graph;

import java.util.Arrays;

public class FindDegreeFromAdjacencyMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,1},{1,0,1},{1,1,0}};
        int degree[] = new int[matrix.length];
        int inDegree[] = new int[matrix.length];
        int outDegree[] = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 1){
                degree[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(degree));
       int matrix2[][] = {{0,1,0},{0,0,1},{1,0,0}};
        for(int i=0;i<matrix2.length;i++){
            for (int j = 0; j < matrix2.length; j++) {
                if(matrix2[i][j] == 1){
                    inDegree[j]++;
                    outDegree[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(inDegree));
        System.out.println(Arrays.toString(outDegree));
    }
}
