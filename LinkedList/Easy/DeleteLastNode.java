package LinkedList.Easy;

import java.util.Arrays;
import java.util.List;

import LinkedList.Out;
import LinkedList.Node;

public class DeleteLastNode {

    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null; //list will become empty

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 5, 8, 7);

        // creating the list:
        Node head = new Node(arr.get(0), new Node(arr.get(1), new Node(arr.get(2), new Node(arr.get(3)))));

        System.out.println("List before deletion:");
        Out.printLL(head);

        System.out.println();
        head = deleteTail(head);

        System.out.println("List after deletion:");
        Out.printLL(head);
    }
}
