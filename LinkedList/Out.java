package LinkedList;

public class Out {
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
