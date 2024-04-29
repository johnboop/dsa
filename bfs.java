import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bfs {
    public static void bfs_go( ArrayList<ArrayList<Integer>> adj, int n, int start)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visted = new boolean[n];
        q.add(start);
        while (!q.isEmpty()) {
            int top = q.poll();
            System.out.println(top);
            for (int b : adj.get(top)) {
                if (!visted[b]) {
                    visted[b] = true;
                    q.add(b);
                }
            }
        }
    }

    public static void dfs_go( ArrayList<ArrayList<Integer>> adj, int n, int start)
    {
        Stack<Integer> q = new Stack<Integer>();
        boolean[] visted = new boolean[n];
        q.add(start);
        while (!q.isEmpty()) {
            int top = q.pop();
            System.out.println(top);
            for (int b : adj.get(top)) {
                if (!visted[b]) {
                    visted[b] = true;
                    q.add(b);
                }
            }
        }
    }
    public static void main(String[] args) {

        int n=8;
        int m;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(1).add(6);
        adj.get(1).add(7);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(2).add(5);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter you n value");
        // n = sc.nextInt();
        // System.out.println("enter your m value");
        // m = sc.nextInt();
        // System.out.println("give input of graph");
        // for (int i = 0; i < m; i++) {
        //     int u,v;
        //     System.out.println("enter u");
        //     u = sc.nextInt();
        //     System.out.println("enter v");
        //     v = sc.nextInt();
        //     adj.get(u).add(v);
        //     adj.get(v).add(u);
        // }
        
        // bfs_go(adj,n,0);
        dfs_go(adj,n,0);
    }
}
