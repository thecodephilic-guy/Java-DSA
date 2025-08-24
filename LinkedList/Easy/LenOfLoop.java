package LinkedList.Easy;

import LinkedList.Node;

public class LenOfLoop {
    public static int lengthOfLoop(Node head){
        if(head == null || head.next == null) return 0;

        //finding the loop:
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){   //loop found
                //calculating length of the loop:
                int count = 1;
                fast = fast.next;

                while(fast != slow){
                    count++;
                    fast = fast.next;
                }

                return count;
            }
        }

        return 0;

    }
    public static void main(String[] args) {
        // Create a linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        // This creates a loop
        fifth.next = second; 

        int loopLength = lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
