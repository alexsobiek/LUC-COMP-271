package binarytree;

public class Tree {
    private Node root;
    private int nodeCount;

    public void add(String string) {
        // Prepare the new Node
        Node newNode = new Node(string);
        // Find a place for it on the tree
        if (root == null) {
            root = newNode; // there are no nodes
            nodeCount++;
        }
        else {
            Node current = root; // Tree is not empty, find a place for newNode
            boolean keepTraversing = true;
            while (keepTraversing) {
                if (newNode.getContent().compareTo(current.getContent()) < 0) {
                    // left
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        nodeCount++;
                        keepTraversing = false;
                    } else current = current.getLeft();
                } else if (newNode.getContent().compareTo(current.getContent()) > 0) {
                    // right
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        nodeCount++;
                        keepTraversing = false;
                    } else current = current.getRight();
                } else keepTraversing = false; // contents are equal
            }
        }

    /**
     * Returns the matching node containing the content if it exists
     * @param content String
     * @return Node
     */
    public Node get(String content) {
        boolean contains = false;
        Node node = root;
        while(node != null && !contains) {
            contains = content.compareTo(node.getContent()) == 0;
            if (!contains) node = node.compare(content);
        }
        return node;
    }

    /**
     * Returns whether the content String exists in the tree or not.
     * @param content Content to search for
     * @return boolean
     */
    public boolean contains(String content) {
        return get(content) != null;
    }
}
