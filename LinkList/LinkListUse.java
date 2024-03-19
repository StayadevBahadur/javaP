package LinkList;

public class LinkListUse {
    public static void print(Node<Integer> head){
        // Node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        // head=temp;
        // while (head != null) {
        //     System.out.print(head.data + " ");
        //     head = head.next;
        // }
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(14);
        // System.out.println(node1.data);
        // System.out.println(node1.next);
        Node<Integer> node2 = new Node<Integer>(29);
        node1.next = node2; 
        Node<Integer> node3 = new Node<Integer>(28);
        node2.next = node3;
       print(node1);
       print(node1);

      

    }
}
