package LinkedList.Easy.DoublyLL;

import LinkedList.Out;
import LinkedList.TwoHeadedNode;

public class DeleteFromEnd {
    public static TwoHeadedNode deleteEnd(TwoHeadedNode head){
        if(head == null || head.next == null) return null;

        TwoHeadedNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.prev.next = null;
        temp = null;

        return head;
     }
    public static void main(String[] args) {
        int[] arr = {1,3,4,1};

        //making the DLL from arr:
        TwoHeadedNode head = Out.convertArray2DLL(arr);

        //DLL from deletion:
        Out.printDoublyLL(head);

        head = deleteEnd(head);

        Out.printDoublyLL(head);
    }
}
