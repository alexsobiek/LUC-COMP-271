package treeassignment;

public class Evaluate {
    public static void main(String[] args) {
        Treeee tree = new Treeee();
        tree.add("He");
        tree.add("was");
        tree.add("surprised");
        tree.add("that");
        tree.add("his");
        tree.add("immense");
        tree.add("laziness");
        tree.add("was");
        tree.add("inspirational");
        tree.add("inspirational");
        tree.add("to");
        tree.add("others");

        System.out.println("The Tree has " + tree.getNodeCount() + " nodes");

        if (tree.contains("inspirational")) { // true
            Node n = tree.get("inspirational");
            System.out.println("The tree contains \"inspirational\" "+ n.getOccurrences() + " times.");
        }
    }
}
