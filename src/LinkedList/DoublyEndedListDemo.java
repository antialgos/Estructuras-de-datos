package LinkedList;

public class DoublyEndedListDemo {
    
    public static void main(String[] args) {
        DoubleEndedList dList = new DoubleEndedList();

        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);
    }
}
