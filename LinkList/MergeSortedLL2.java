package LinkList;

import java.util.Scanner;

public class MergeSortedLL2 {
    public static Node<Integer> CLL(){
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
    
    public static Node<Integer> merge(Node<Integer> head1 , Node<Integer> head2){
      if (head1 == null) {
        return head2;

      }
      if (head2 == null) {
        return head1;
      }

      Node<Integer> t1 = head1, t2 = head2;
      Node<Integer> head = null ,tail = null;
// This is just for setting the head and the tail for initailize the process
      if (t1.data <= t2.data) {
        head = t1;
        tail = t1;
        t1 = t1.next;
      }else{
        head = t2;
        tail = t2;
        t2= t2.next;
      }
// Here the Modificitaion of linklist starts
      while (t1 != null && t2 != null) {
        if (t1.data <= t2.data ) {
          tail.next = t1;
          tail = t1;
          t1 = t1.next;
        }else{
          tail.next = t2;
          tail = t2;
          t2 = t2.next;
        }
      }
      if (t1 != null) {
        tail.next = head1;
    } else if (t2 != null) {
        tail.next = head2;
    }
    return head;
    }
    public static void print(Node<Integer> head){
      while (head != null) {
          System.out.print(head.data + " ");
          head = head.next;
      }
     }
     public static void main(String[] args) {
      Node<Integer> node1 = CLL();
      Node<Integer> node2 = CLL();
     node1 = merge(node1, node2);
     print(node1);
     }
    
}
