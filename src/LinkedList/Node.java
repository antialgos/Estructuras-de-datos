package LinkedList;

public class Node {
    public int data;

    public Node(int data) {
        this.data = data;
    }
    private Node nextNode;
    
    public Node getNextNode() {
        return nextNode;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data : "+data;
    }

}
