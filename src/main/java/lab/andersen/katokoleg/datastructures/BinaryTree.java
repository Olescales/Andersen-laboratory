package lab.andersen.katokoleg.datastructures;

/**
 * @author Katok Oleg on 11.01.2021
 */
public class BinaryTree {

    /**
     * @param startNode - vertex of the tree
     * @return integer value - tree's depth
     */
    public int findBinaryTreeDepth(TreeNode startNode) {
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
