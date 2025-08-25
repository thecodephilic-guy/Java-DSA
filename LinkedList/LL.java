package LinkedList;

import LinkedList.Easy.RemoveNFromLast;

public class LL {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        //building the LL using array:
        Node head = new Node(arr[0], new Node(arr[1], new Node(arr[2], new Node(arr[3]))));


        System.out.println("Linked list");
        Out.printLL(head);

        System.out.println("Deleting 2nd node from last:");

        head = removeNthFromEnd(head, 2);
        
    }
}
