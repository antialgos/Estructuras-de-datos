package LinkedList;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList integers = new DoubleLinkedList();

        integers.insertAtHead(5);
        integers.insertAtHead(51);
        integers.insertAtHead(15);
        integers.insertAtHead(2);
        integers.insertAtHead(7);
        integers.insertAtHead(1);
        integers.insertAtHead(8);

        System.out.println(integers);
    }
}
