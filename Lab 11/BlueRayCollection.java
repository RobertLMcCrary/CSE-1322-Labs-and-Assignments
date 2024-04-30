

public class BlueRayCollection {
    private Node head;

    public BlueRayCollection() {
        this.head = null;
    }

    public void add(String title, String director, int year, double cost) {
        BlueRayDisk newDisk = new BlueRayDisk(title, director, year, cost);
        Node newNode = new Node(newDisk);

        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void showAll() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }
}
