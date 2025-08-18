package LinkedList.Easy;
import java.util.Arrays;
import java.util.List;

import LinkedList.Out;
import LinkedList.Node;


public class InsertAtHead {
    //Funtion to insert at Head:
    public static Node insert(Node head, int val){
        Node newNode = new Node(val, head);

        return newNode;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        //Let's create a LL from this array:
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        //Printing LL before inseting at head:
        System.out.println("List before insertion");
        Out.printLL(head);
        
        System.out.println();

        System.out.printf("List after inseting %d \n", val);
        head = insert(head, val);

        Out.printLL(head);
    }
    
}