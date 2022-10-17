package LinkedList;

public class DoubleLinkedList {
    private DoubleLinkedNode head;

    public void insertAtHead (int data) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if(head == null) return 0;
        int length = 0;
        DoubleLinkedNode current = this.head;

        while (current != null) {
            length += 1;
            current = current.getNextNode();
        }

        return length;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoubleLinkedNode n = this.head;

        while (n != null) {
            sb.append("Node data: ");
            sb.append(n.getData());
            sb.append("\n");

            n = n.getNextNode();
        }
        return sb.toString();
    }
}
