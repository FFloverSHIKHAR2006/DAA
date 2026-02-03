import java.util.*;

class DijkstraEasy {
    static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n]; 
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    u = j;
                }
            }
            if (u == -1) break;
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (graph[u][v] > 0 && !visited[v] && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("To node " + i + " = " + dist[i]);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 3, 0, 0},
            {1, 0, 0, 2, 0},
            {3, 0, 0, 0, 2},
            {0, 2, 0, 0, 1},
            {0, 0, 2, 1, 0}
        };
        dijkstra(graph, 0);
    }
}