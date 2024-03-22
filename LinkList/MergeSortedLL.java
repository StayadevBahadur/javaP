package LinkList;

import java.util.Scanner;

public class MergeSortedLL {
        public static Node<Integer> CLinkList(){
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
  public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
    if (head1 == null) {
     return head2;
 }
 if (head2 == null) {
     return head1;
 }

Node<Integer> dummy = new Node<Integer>(0); // Dummy node for the merged list
Node<Integer> curr = dummy; // Pointer for the current node in the merged list

 while (head1 != null && head2 != null) {
     if (head1.data <= head2.data) {
         curr.next = head1;
         head1 = head1.next;
     } else {
         curr.next = head2;
         head2 = head2.next;
     }
     curr = curr.next;
 }

 // Connect the remaining nodes from either list
 if (head1 != null) {
     curr.next = head1;
 } else if (head2 != null) {
     curr.next = head2;
 }

 return dummy.next; // Return the merged list's head
}


     public static void print(Node<Integer> head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
       }
       public static void main(String[] args) {
        Node<Integer> node1 = CLinkList();
        Node<Integer> node2 = CLinkList();
       node1 = mergeTwoSorteds(node1, node2);
       print(node1);
       }
       
}
