package lab.andersen.katokoleg.datastructures;

public class TreeNode {

    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(TreeNode leftNode, TreeNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
