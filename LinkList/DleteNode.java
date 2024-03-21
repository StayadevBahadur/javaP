package LinkList;

import java.util.Scanner;

public class DleteNode {
    public static Node<Integer> TakeInputAndCreateLinkList(){
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            }else{
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
    public static void print(Node<Integer>head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) { 
        if (head == null) {
            return head;
        }

        // If the position is 0, delete the head node
        if (pos == 0) {
            return head.next;
        }

        Node<Integer> prev = null;
        Node<Integer> current = head;
        int count = 0;

        // Traverse the list to find the node at the given position
        while (current != null && count != pos) {
            prev = current;
            current = current.next;
            count++;
        }

        // If the position is greater than or equal to the length of the list, do nothing
        if (count != pos || current == null) {
            return head;
        }

        // Delete the node at the given position
        prev.next = current.next;

        return head;
    }

  
    public static void main(String[] args) {
        Node<Integer> node1 = TakeInputAndCreateLinkList();
        node1 = deleteNode(node1, 2 );
        print(node1);
    }
}
