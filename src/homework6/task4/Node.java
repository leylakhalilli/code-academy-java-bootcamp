package homework6.task4;

public class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "[" + "value=" + value + "," + "next=" + next + "]";
    }
}
