package LinkList;

import java.util.Scanner;

public class AppendLastNToFirst {
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
  public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) { 
    if (head == null || n <= 0) {
      return head;
  }
  // Step 1: Find the length of the list
  int length = 0;
  Node<Integer> current = head;
  while (current != null) {
      length++;
      current = current.next;
  }
  // If N is greater than or equal to the length, no change is needed
  if (n >= length) {
      return head;
  }
  // Step 2: Find the node N positions from the end
  int targetIndex = length - n;
  Node<Integer> prev = null;
  current = head;
  for (int i = 0; i < targetIndex; i++) {
      prev = current;
      current = current.next;
  }
  // Step 3: Disconnect the sublist of the last 'N' nodes
  if (prev != null) {
      prev.next = null;
  }
  // Step 4: Find the last node of the original list
  Node<Integer> lastNode = current;
  while (lastNode.next != null) {
      lastNode = lastNode.next;
  }
  // Step 5: Connect the last node of the original list to the head of the sublist
  lastNode.next = head;
  // Set the new head to be the node 'N' positions from the end
  Node<Integer> newHead = current;
  return newHead;
}

   public static void print(Node<Integer> head){
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
   }
   public static void main(String[] args) {
    Node<Integer> node = CLinkList();
    node = appendLastNToFirst(node,2);
    print(node);
   }

    
}