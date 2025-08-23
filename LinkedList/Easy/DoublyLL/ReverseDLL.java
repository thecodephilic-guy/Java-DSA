package LinkedList.Easy.DoublyLL;

import LinkedList.Out;
import LinkedList.TwoHeadedNode;

public class ReverseDLL {

    public static TwoHeadedNode reverseList(TwoHeadedNode head){
        if(head == null || head.next == null) return head;
        TwoHeadedNode temp = null;
        TwoHeadedNode current = head;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            
            current = current.prev;
        }

        return temp.prev;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};

        //creating DLL:
        TwoHeadedNode head = Out.convertArray2DLL(arr);

        //printing the list:
        System.out.println("List before reversing:");
        Out.printDoublyLL(head);

        //reversing the DLL:
        head = reverseList(head);

        System.out.println("List after reversing");
        Out.printDoublyLL(head);
    }
}
