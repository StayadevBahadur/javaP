package LinkList;

import java.util.Scanner;

public class FindTheMid {
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
    
    public static Node<Integer> midPoint(Node<Integer> head) {
       
              
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        Node<Integer> prev = null; // To keep track of the previous node of slow
  
          while (fast != null && fast.next != null) {
              prev = slow; // Update prev to the current slow pointer
              slow = slow.next; // Move slow pointer by one step
              fast = fast.next.next; // Move fast pointer by two steps
          }
  
          if (fast == null) {
              // Even length list, return the left side middle node
              return prev;
          } else {
              // Odd length list, return the middle node
              return slow;
          }
      }
  
     public static void print(Node<Integer> head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
       }
       public static void main(String[] args) {
        Node<Integer> node = CLinkList();
        Node<Integer> node2 = midPoint(node);
       System.out.println(node2.data);
       }
}
