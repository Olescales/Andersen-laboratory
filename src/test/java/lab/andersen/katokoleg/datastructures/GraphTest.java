package lab.andersen.katokoleg.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class GraphTest {

    @Test
    public void graphIsTree_True() {
        int[][] graph = new int[7][7];
        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][3] = 1;
        graph[2][5] = 1;
        graph[3][4] = 1;
        graph[5][6] = 1;
        boolean actual = Graph.isGraphTree(graph);
        Assert.assertTrue(actual);
    }

    @Test
    public void graphIsTree_False() {
        int[][] graph = new int[7][7];
        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][3] = 1;
        graph[2][5] = 1;
        graph[2][3] = 1;
        graph[3][4] = 1;
        graph[5][6] = 1;
        boolean actual = Graph.isGraphTree(graph);
        Assert.assertFalse(actual);
    }
}