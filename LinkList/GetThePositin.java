package LinkList;

import java.util.Scanner;

public class GetThePositin {

 public static Node<Integer> CreateALinkList(){
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
 public static int GetPosition(Node<Integer> head, int n ){
    int count = 0;
    while (head != null) {
       if (head.data != n) {
        count ++;
        head = head.next;
       } else if (head.data == n){
        return count;
       }  
    }
    return -1;
 }
  public static void print(Node<Integer>head){
    while (head != null) {
        System.err.print(head.data + " ");
        head = head.next;
    }
  }
  public static void main(String[] args) {
    Node<Integer> node1 = CreateALinkList();
    int  node = GetPosition(node1, 5);
    System.err.println(node);
  }
}
