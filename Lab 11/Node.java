

public class Node {
    private BlueRayDisk data;
    private Node next;

    public Node(BlueRayDisk data) {
        this.data = data;
        this.next = null;
    }

    public BlueRayDisk getData() {
        return data;
    }

    public void setData(BlueRayDisk data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}