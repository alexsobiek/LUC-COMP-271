package TreesAndNodes;

public class Node implements Comparable<Node> {

    String content;
    Node left;
    Node right;

    /**
     * Basic constructor.
     *
     * @param content String to place in node.
     */
    public Node(String content) {
        this.content = content;
        this.left = null;
        this.right = null;
    } // constructor Node


    /**
     * Compares the provided Node to this Node
     * @param node Node to compare to
     * @return int
     */
    @Override
    public int compareTo(Node node) {
        // aEven/bEven checks if the content's length is even
        boolean aEven = this.content.length() % 2 == 0;
        boolean bEven = node.content.length() % 2 == 0;
        int output = 0;
        if (aEven && !bEven) output = 1;        // even, odd
        else if (!aEven && bEven) output = -1;  // odd, even
        return output; // Output remains 0 if aEven == bEven
    }

    /**
     * Returns a String containing information about the Node
     * @return String
     */
    public String toString() {
        int children = 0;
        if (left != null) children++;
        if (right != null) children++;

        /**
         * Double ternary operator
         * If children is 0, "no children"
         * If children is 1, "1 child"
         * else "n children:"
         */
        String childrenString = children == 0 ? "no children" : children == 1 ? "1 child" : String.format("%d children", children);
        return String.format("This node contains \"%s\" and has %s.", content, childrenString);
    } // method toString()

} // class Node
