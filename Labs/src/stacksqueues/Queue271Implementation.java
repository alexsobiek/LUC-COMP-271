package stacksqueues;

public class Queue271Implementation {
    public static void main(String[] args) {
        Queue271<String> queue = new Queue271<>();
        queue.push("A");
        queue.push("B");
        queue.push("C");
        queue.push("D");
        queue.push("E");
        System.out.println(queue);
        System.out.println("Removed " + queue.pop());
        System.out.println(queue);
        System.out.println("Removed " + queue.pop());
        System.out.println(queue);
        System.out.println("Removed " + queue.pop());
        System.out.println(queue);
        System.out.println("Removed " + queue.pop());
        System.out.println(queue);
        System.out.println("Removed " + queue.pop());
        System.out.println(queue);
    }
}
