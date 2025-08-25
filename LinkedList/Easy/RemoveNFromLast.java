package LinkedList.Easy;

import LinkedList.Node;

public class RemoveNFromLast {
    public static Node removeNthFromEnd(Node head, int n) {
        if(head == null) return null;

        //calculating length:
        Node temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        if(len == n){
            //delete head:
            Node newHead = head.next;
            head = null;
            return newHead;

        }

        int idx = len-n;
        temp = head;

        while(temp != null){
            idx--;
            if(idx == 0){
                break;
            }
            temp = temp.next;
        }

        //delete the node
        Node front = temp.next;
        temp.next = temp.next.next;
        front = null;

        return head;

    }
}
