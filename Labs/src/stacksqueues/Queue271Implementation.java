package stacksqueues;

public class Queue271Implementation {
    public static void main(String[] args) {
        Queue271<String> queue = new Queue271<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        System.out.println(queue);
        System.out.println("Removed " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed " + queue.dequeue());
        System.out.println(queue);
    }
}
