package LinkList;

import java.util.Scanner;

public class TakingInput {
    public static Node<Integer> TakeInput() {
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data     = s.nextInt();    
       while (data!= -1) {
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
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        print(head); 
    }
}
