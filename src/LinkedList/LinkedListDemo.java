package LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(19);
        list.insertAtHead(20);
        list.insertAtHead(13);
        list.insertAtHead(1);
        list.deleteFromHead();

        System.out.println(list);
        System.out.println(list.length());
        System.out.println("Found: " + list.find(19));
    }
}
