package LinkList;

import java.util.Scanner;

public class EluminateDuplicates {
    public static Node<Integer> CLL (){
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> NewNode = new Node<Integer>(data);
            if (head == null) {
                head = NewNode;
            }else{
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = NewNode;
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
    }
    public static void main(String[] args) {
        Node<Integer> Start = CLL();
        print(Start);
    }
   
}
