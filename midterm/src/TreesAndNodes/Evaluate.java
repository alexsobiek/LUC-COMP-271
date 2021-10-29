package TreesAndNodes;

/**
 * Driver class to evaluate Treeee and Node.
 */
public class Evaluate {
    public static void main(String[] args) {
        Treeee demo = new Treeee();
        demo.add("now");
        demo.add("is");
        demo.add("the");
        demo.add("winter");
        demo.add("of");
        demo.add("our");
        demo.add("discontent");

        // Comparable Testing
        System.out.printf("%s comparedTo %s = ", demo.root.content, demo.root.left.content);
        System.out.println(demo.root.compareTo(demo.root.left)); // = -1, odd, even
        System.out.printf("%s comparedTo %s = ", demo.root.content, demo.root.right.content);
        System.out.println(demo.root.compareTo(demo.root.right)); // = 0, both are odd
        System.out.printf("%s comparedTo %s = ", demo.root.left.content, demo.root.right.content);
        System.out.println(demo.root.left.compareTo(demo.root.right)); // = 1, even, odd
        System.out.printf("%s comparedTo %s = ", demo.root.left.content, demo.root.right.right.content);
        System.out.println(demo.root.left.compareTo(demo.root.right.right)); // 0 both are even

        // toString() testing
        System.out.println("\n" + demo.root);       // now, 2 children
        System.out.println(demo.root.left);         // is, 1 child
        System.out.println(demo.root.left.left);    // discontent, no children
    }
}
