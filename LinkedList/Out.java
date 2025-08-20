package LinkedList;

public class Out {
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void printDoublyLL(TwoHeadedNode head) {
        System.out.print("null <- ");
        while(head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static TwoHeadedNode convertArray2DLL(int[] arr){
        //creating head of the list:
        TwoHeadedNode head = new TwoHeadedNode(arr[0]);
        TwoHeadedNode previous = head;

        for(int i=1; i<arr.length; i++){
            TwoHeadedNode temp = new TwoHeadedNode(arr[i], null, previous);
            previous.next = temp;
            previous = temp;
        }

        return head;
    }
}
