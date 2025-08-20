package LinkedList.Easy.DoublyLL;

import LinkedList.Out;
import LinkedList.TwoHeadedNode;

public class InsertAtEnd {

    public static TwoHeadedNode insertAtTail(TwoHeadedNode head, int data){
        //create a new node:
        TwoHeadedNode newNode = new TwoHeadedNode(data);

        if(head == null) return newNode;

        TwoHeadedNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};

        //creating DLL:
        TwoHeadedNode head = Out.convertArray2DLL(arr);

        //printing the list:
        System.out.println("List before insertion:");
        Out.printDoublyLL(head);

        //inseting at end:
        head = insertAtTail(head, 10);

        System.out.println("List after insertion:");
        Out.printDoublyLL(head);
    }
}
