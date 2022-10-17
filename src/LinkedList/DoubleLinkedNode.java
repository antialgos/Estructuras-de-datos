package LinkedList;

public class DoubleLinkedNode {
    private int data;
    private DoubleLinkedNode nextNode;
    private DoubleLinkedNode previousNode;
    
    public DoubleLinkedNode(int data) {
        this.setData(data);
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public DoubleLinkedNode getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(DoubleLinkedNode previousNode) {
        this.previousNode = previousNode;
    }
    public DoubleLinkedNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(DoubleLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

}
