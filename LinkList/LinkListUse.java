package LinkList;

public class LinkListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(14);
        System.out.println(node1.data);
        System.out.println(node1.next);
        Node<Integer> node2 = new Node<Integer>(29);
        node1.next = node2; 
    }
}
