package lab.andersen.katokoleg.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private TreeNode treeNode;

    @Before
    public void init() {
        TreeNode fiveLeftLevel = new TreeNode();
        TreeNode fourLeftLevel = new TreeNode();
        fiveLeftLevel.setLeftNode(fiveLeftLevel);
        TreeNode threeLeftLevel = new TreeNode();
        threeLeftLevel.setLeftNode(fourLeftLevel);
        TreeNode threeRightLevel = new TreeNode();
        TreeNode twoLeftLevel = new TreeNode(threeLeftLevel, threeRightLevel);
        TreeNode twoRightLevel = new TreeNode();
        TreeNode threeRightRightLevel = new TreeNode();
        twoRightLevel.setRightNode(threeRightRightLevel);
        treeNode = new TreeNode(twoLeftLevel, twoRightLevel);
    }

    @Test
    public void findBinaryTreeDepth() {
        BinaryTree binaryTree = new BinaryTree();
        int actualDepth = binaryTree.findBinaryTreeDepth(treeNode);
        Assert.assertEquals(5, actualDepth);

    }
}