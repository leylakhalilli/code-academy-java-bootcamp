package homeworks.homework6.task4;

public class DoublyLinkedList {
    int size;
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addBefore(Node node) {
        if (head == null) {
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
        }
        head = node;
        size++;
    }

    public void addLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        size++;
    }


    public void deleteBefore() {
        if (head == null) {
            System.out.println("List boshdur");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;

            }
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List boshdur");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.prev.next = null;
                tail = tail.prev;
            }
        }
        size--;

    }


    public void show() {
        System.out.println(this.head);
    }

}
