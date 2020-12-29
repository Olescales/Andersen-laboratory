package lab.andersen.katokoleg.datastructures;

public class BinaryTree {

    public static int findBinaryTreeDepth(TreeNode startNode) {
        if (startNode == null) {
            return 1;
        } else {
            int left = findBinaryTreeDepth(startNode.getLeftNode());
            int right = findBinaryTreeDepth(startNode.getRightNode());
            if (left > right) {
                return 1 + left;
            } else {
                return 1 + right;
            }
        }
    }
}
