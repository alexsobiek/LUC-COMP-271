package binarytree;

public class Node {
    private final String content;
    private Node right;
    private Node left;

    /**
     * Constructor
     * @param content Content to store in this node
     */
    public Node(String content) {
        this.content = content;
        this.right = null;
        this.left = null;
        occurances = 1;
    }

    /**
     * Returns the content of this Node
     * @return String
     */
    public String getContent() {
        return content;
    }

    /**
     * Returns the right node
     * @return Node
     */
    public Node getRight() {
        return right;
    }

    /**
     * Sets the right node
     * @param right Node
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * Returns the left node
     * @return Node
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Sets the left node
     * @param left Node
     */
    public void setLeft(Node left) {
        this.left = left;
    }
}
