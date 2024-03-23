package LinkList;

import java.util.Scanner;

public class MergeSort {

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

  public static Node<Integer> sortList(Node<Integer> head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node<Integer> middle = findMiddle(head);
    Node<Integer> nextToMiddle = middle.next;
    middle.next = null;

    Node<Integer> left = sortList(head);
    Node<Integer> right = sortList(nextToMiddle);

    return merge(left, right);
  }

  public static Node<Integer> findMiddle(Node<Integer> head) {
    Node<Integer> slow = head;
    Node<Integer> fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static Node<Integer> merge(Node<Integer> left, Node<Integer> right) {

    Node<Integer> dummy = new Node<Integer>(0);
    Node<Integer> current = dummy;

    while (left != null && right != null) {
      if (left.data < right.data) {
        current.next = left;
        left = left.next;
      } else {
        current.next = right;
        right = right.next;
      }
      current = current.next;
    }

    if (left != null) {
      current.next = left;
    } else if (right != null) {
      current.next = right;
    }

    return dummy.next;
  }

  public static void print(Node<Integer> head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void main(String[] args) {
    Node<Integer> node = CLinkList();
    Node<Integer> node2 = sortList(node);
    print(node2);

  }
}
