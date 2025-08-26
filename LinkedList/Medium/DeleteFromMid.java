package LinkedList.Medium;

import LinkedList.Node;

public class DeleteFromMid {
    public Node deleteMiddle(Node head) {
        if(head == null || head.next == null) return null;

        //calculate length of the list:
        int len = 0;
        Node temp = head;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int mid = len/2;
        temp = head;
        int idx = 0;

        while(idx < mid-1){
            temp = temp.next;
            idx++;
        }

        Node front = temp.next;
        temp.next = temp.next.next;
        front = null;

        return head;
        
    }
}
