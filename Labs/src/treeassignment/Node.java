package treeassignment;

public class Node {
    private final String content;
    private Node right;
    private Node left;
    private int occurrences;

    /**
     * Constructor
     * @param content Content to store in this node
     */
    public Node(String content) {
        this.content = content;
        this.right = null;
        this.left = null;
        occurrences = 1;
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

    /**
     * Returns the amount of times this node has been stored in the tree
     * @return int
     */
    public int getOccurrences() {
        return occurrences;
    }

    /**
     * Increments the occurrences by 1
     */
    public void addOccurrence() {
        occurrences++;
    }

    /**
     * Compares the given content String to the left and right nodes and returns the next one in the sequence.
     * @param content String to compare to
     * @return Node
     */
    public Node compare(String content) {
        Node node = null;
        if (this.content.compareTo(content) < 0 && right != null) node = right;
        else if (this.content.compareTo(content) > 0 && left != null) node = left;
        return node;
    }
}
