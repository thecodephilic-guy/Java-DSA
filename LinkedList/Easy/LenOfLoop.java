package LinkedList.Easy;
import java.util.HashMap;
import java.util.Map;

import LinkedList.Node;

public class LenOfLoop {
    public static int lengthOfLoop(Node head){
        if(head == null || head.next == null) return 0;

        Map<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int timer = 0;

        while(temp != null){
            if(!map.containsKey(temp)){
                map.put(temp, ++timer);
                temp = temp.next;
            }else{
                //temp is the starting point of the loop
                return timer - map.get(temp);
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
