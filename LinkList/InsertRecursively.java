package LinkList;

import java.util.Scanner;

public class InsertRecursively {
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
    public static void print(Node<Integer> head){
     if (head == null) {
       return;
     }
     System.out.print(head.data + " ");
     print(head.next);
    }
    public static Node<Integer> insertR(Node<Integer> head, int pos, int elem){
        if (pos == 0) {
          Node<Integer> newNode = new Node<Integer>(elem);
          newNode.next = head;
          return newNode;
        }
        head.next = insertR(head.next, pos-1, elem);

        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head1 = CLL();
        head1 = insertR(head1, 2, 3); 
        print(head1);
    }
}