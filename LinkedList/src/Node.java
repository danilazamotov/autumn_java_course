public class Node {
    private LinkList head;

    public Node() { head = null; }

    private boolean isEmpty () {
        return head == null;
    }
    public void add(int data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }
    public void print() {
        LinkList temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
