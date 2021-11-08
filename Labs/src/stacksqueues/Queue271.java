package stacksqueues;

public class Queue271<E> {
    private Node<E> head;
    private Node<E> current;

    public Queue271() { }

    public void push(E object) {
        Node<E> n = new Node<>(object);
        if (head == null) {
            head = n;
            current = head;
        }
        else {
            current.setNext(n);
            current = n;
        }
        if (head == null) head = n;

    }

    public E pop() {
        E removed = head.getObject();
        if (head.hasNext()) head = head.getNext();
        else head = null;
        return removed;
    }

    public E peek() {
        return current.getObject();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (head == null) builder.append("null");
        else {
            Node<E> n = head;
            builder.append(n.getObject());
            while (n.hasNext()) {
                builder.append(", ").append(n.getNext().getObject());
                n = n.getNext();
            }
        }
        return builder.toString();
    }

    class Node<E> {
        private final E object;
        private Node<E> next;

        protected Node(E object) {
            this.object = object;
        }

        protected E getObject() {
            return object;
        }

        protected void setNext(Node<E> node) {
            this.next = node;
        }

        protected Node<E> getNext() {
            return next;
        }

        protected boolean hasNext() {
            return next != null;
        }

    }
}
