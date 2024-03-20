package LinkList;

import java.util.Scanner;

public class InserAtPosition {
    public static Node<Integer> TakeInputforInsert(){
        // Create a Node variable as head of the node List set it  null just creat for temp do not alocate it any space in memory
        Node<Integer> head = null;
        Scanner s = new Scanner(System.in);
        // Initailze a data (integer)
        int data = s.nextInt();
        // Run the proccese of taking input untill the input is -1 
        while (data != -1) { 
            // create a new node who's data is the data which we taken above
            Node<Integer> newNode = new Node<Integer>(data);
            // look that the head of our linkList not null if it is null set the head value as that the value of the data 
            if (head == null) {
                head = newNode;
            }
            //If the head of the linkList is not empty Create a temp Node variable set the value of it as head 
            //Now check the value of temp.next value if it is not null set the temp as temp.next
            // If it is null set the temp.next to NewNode 
            else{
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            // After setting the data update the data 
            data = s.nextInt();
        }
        return head;
    }
    public static Node<Integer> Insert(Node<Integer>head,int num, int pos){
        Node<Integer> ToBeInserted = new Node<Integer>(num);
        Node<Integer> temp = head;

        if (pos == 0) { 
            ToBeInserted.next = head;
            return ToBeInserted;
        }

        int i = 0;
        while (i != pos-1) {
            temp = temp.next;     
            i++; 
        }
        ToBeInserted.next = temp.next;
        temp.next = ToBeInserted;
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
        Node<Integer> node1 =  TakeInputforInsert();
        node1 =  Insert(node1,3,0);
        print(node1);
    }
}
