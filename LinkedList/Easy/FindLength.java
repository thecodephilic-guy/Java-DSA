package LinkedList.Easy;

import LinkedList.Node;

public class FindLength {

    public static int getLength(Node head) {
        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        //building the LL using array:
        Node head = new Node(arr[0], new Node(arr[1], new Node(arr[2], new Node(arr[3]))));

        int length = getLength(head);

        System.out.println("Length of the LL is "+ length);
    }
}
