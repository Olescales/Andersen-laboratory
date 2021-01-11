package lab.andersen.katokoleg.datastructures;

public class Graph {

    public static boolean isGraphTree(int[][] graph) {
        boolean[] visitedVertexes = new boolean[graph.length];
        visitedVertexes[0] = true;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (graph[i][j] == 1 && visitedVertexes[j]) {
                    return false;
                } else if (graph[i][j] == 1) {
                    visitedVertexes[j] = true;
                }
            }
        }
        return true;
    }
}
