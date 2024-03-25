package LinkList;

import java.util.Scanner;

public class DeleteRecur {
    public static Node<Integer> TakeInputAndCreateLinkList() {
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        return head;
    	
	}
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
public static void main(String[] args) {
    Node<Integer> node1 = TakeInputAndCreateLinkList();
    print(node1);
}
}
