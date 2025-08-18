package LinkedList.Easy;

import LinkedList.Node;

public class Search {
    public static int searchIndex(Node head, int data){
        if(head == null) return -1;

        int count = 0;
        
        while(head != null){
            if(head.data == data){
                return count;
            }
            count++;
            head = head.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        Node head = new Node(arr[0], new Node(arr[1], new Node(arr[2], new Node(arr[3]))));

        int index = searchIndex(head, 5);
        System.out.println(index);
    }
}
