package LinkList;

import java.util.Scanner;

public class LengthOfLinkList {
    public static Node<Integer> CreateALinkList(){
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> NewNode = new Node<Integer>(data);
            if (head == null) {
                head = NewNode;
            }else{
                Node <Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = NewNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static int length(Node<Integer> head){
       int count = 0;
       while (head != null ) {
            head = head.next;
            count++;
       } 
       return count;
    }
    public static void print(Node<Integer> head){
        while (head !=null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node <Integer> node1 = CreateALinkList();

        print(node1);
    }
}
