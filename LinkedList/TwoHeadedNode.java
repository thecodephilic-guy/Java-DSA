package LinkedList;

public class TwoHeadedNode {
    public int data;
    public TwoHeadedNode next;
    public TwoHeadedNode prev;

    public TwoHeadedNode(int data, TwoHeadedNode next, TwoHeadedNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public TwoHeadedNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
