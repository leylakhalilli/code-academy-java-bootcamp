package homework6.task4;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();


        linkedList.addBefore(new Node(5));
        linkedList.addBefore(new Node(2));
        linkedList.addBefore(new Node(6));
        linkedList.addBefore(new Node(7));
        linkedList.addBefore(new Node(2));
        linkedList.show();


        linkedList.addLast(new Node(8));
        linkedList.show();

        linkedList.deleteBefore();
        linkedList.show();

        linkedList.deleteLast();
        linkedList.show();

        System.out.println(linkedList.size);
    }
}
