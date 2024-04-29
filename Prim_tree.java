import java.util.Arrays;

public class Prim_tree {
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
    public static void prim(int graph[][],int src, int V){
        boolean[] processed = new boolean[V];
        Arrays.fill(processed, false);
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        int[] value = new int[V];
        Arrays.fill(value, Integer.MAX_VALUE);
        parent[src] = -1;
        value[src]=0;
        for(int i =0;i<V;i++){
            int u = min_value(value,processed,V);
            processed[u] = true;
            for(int j = 0;j<V;j++){
                if(graph[u][j]!=0 && processed[j]==false
                && (graph[u][j]< value[j])){
                value[j] = graph[u][j];
                parent[j] = u;
                }
            }
        }
        for(int i = 0;i<V;i++){
            System.out.println(i+" "+ value[i]);
        }
    }
    public static void main(String[] args) {
        int graph[][] ={ { 0, 4, 6, 0, 0, 0},
        { 4, 0, 6, 3, 4, 0},
        { 6, 6, 0, 1, 0, 0},
        { 0, 3, 1, 0, 2, 3},
        { 0, 4, 0, 2, 0, 7},
        { 0, 0, 0, 3, 7, 0}
    };
prim(graph,0,graph.length);
    }
}
