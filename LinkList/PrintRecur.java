package LinkList;

import java.util.Scanner;

public class PrintRecur {
     public static Node<Integer> CLinkList() {
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

  public static void printRecursive(Node<Integer> head){
    if (head == null) {
        return;
    }
    printRecursive(head.next);
    System.out.print(head.data + " ");
    
  }

  public static void main(String[] args) {
    Node<Integer> node = CLinkList();
    printRecursive(node);
  }
}
