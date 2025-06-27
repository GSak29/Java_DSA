package Graph;
import java.util.*;
public class MatrixDfsBfs {

    static int vertices;
    static int[][] adjacencyMatrix;

    MatrixDfsBfs(int vertices) {
        MatrixDfsBfs.vertices = vertices;
        MatrixDfsBfs.adjacencyMatrix = new int[vertices][vertices];
    }

    public static void dfslogic(boolean[] visited, int start){
        visited[start] = true;
        System.out.print(start+ " ");
        for(int i=0;i<vertices;i++){
            if(adjacencyMatrix[start][i] == 1 && !visited[i]){
                dfslogic(visited,i);
            }
        }
    }


    public static void dfs(int start){
        System.out.println("dfs: ");
        boolean[] visited = new boolean[vertices];
        dfslogic(visited,start);
    }
    public static void bfs(int start){

        boolean[] visited = new boolean[vertices];
        Queue<Integer> data = new ArrayDeque<>();
        visited[start]= true;
        data.add(start);
        System.out.println("bfs: ");
        while(!data.isEmpty()){
            int current = data.poll();
            System.out.print(current+ " ");
            for(int i =0 ; i<vertices; i++){
                if(adjacencyMatrix[current][i]==1 && !visited[i]){
                    visited[i] = true;
                    data.add(i);
                }
            }
        }
        System.out.println();
    }


    public static void addEdges(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    public static void display() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        MatrixDfsBfs m = new MatrixDfsBfs(6);
        display();
        System.out.println();
        addEdges(0, 1);
        addEdges(1, 2);
        addEdges(4, 2);
        addEdges(4, 5);
        addEdges(3, 4);
        addEdges(1, 3);  
        bfs(0);
        System.out.println();
        display();
        System.out.println();
        dfs(0);
        System.out.println();

    }

}
