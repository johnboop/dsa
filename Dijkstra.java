import java.util.Arrays;

public class Dijkstra {

    public static int min_value(int[] value,boolean processed[], int V){
        int ans = Integer.MAX_VALUE;
        int vertex =-1;
        for(int i = 0;i<V;i++){
            if(processed[i]==false && (value[i]<= ans)){
                ans= value[i];
                vertex = i;
            }
        }
        return vertex;
    }

    public static void dijkstra(int graph[][],int src, int V){
        boolean[] processed = new boolean[V];
        Arrays.fill(processed, false);
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        int[] value = new int[V];
        Arrays.fill(value, Integer.MAX_VALUE);
        parent[src] = -1;
        value[src]=0;
        for(int i=0;i<V;i++){
            int mini = min_value(value,processed, V);
            processed[mini] = true;
            for(int j = 0;j<V;j++){
                if(graph[mini][j]!=0 && processed[j]==false && value[mini] != Integer.MAX_VALUE && (graph[mini][j]+value[mini] < value[j])){
                    value[j] = graph[mini][j]+value[mini];
                    parent[j] = mini;
                }
            }
        }
        for(int i = 0;i<V;i++){
            System.out.println(i+" "+ value[i]);
        }
    
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

    dijkstra(graph,0, graph.length);
    }
}
