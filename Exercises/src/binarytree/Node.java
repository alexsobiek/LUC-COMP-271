package binarytree;

public class Node {
    private final String content;
    private Node right;
    private Node left;

    public Node(String content) {
        this.content = content;
        this.right = null;
        this.left = null;
    }

    public String getContent() {
        return content;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
