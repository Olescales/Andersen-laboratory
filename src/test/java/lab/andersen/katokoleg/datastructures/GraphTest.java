package lab.andersen.katokoleg.datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;

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
        Graph graph1 = new Graph();
        boolean actual = graph1.isGraphTree(graph);
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
        Graph graph1 = new Graph();
        boolean actual = graph1.isGraphTree(graph);
        Assert.assertFalse(actual);
    }
}