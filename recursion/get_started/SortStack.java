package recursion.get_started;
import java.util.*;

public class SortStack {
    public static void sort(Stack<Integer> st){
        if(st.isEmpty() || st.size() == 1) return;
        
        int top = st.pop();
        sort(st);
        insert(st, top);
    }

    public static void insert(Stack<Integer> st, int value){
        if(st.isEmpty() || st.peek() <= value){
            st.push(value);
            return;
        }

        int top = st.pop();
        insert(st, value);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(4);

        System.out.println("Stack before sorting: ");
        System.out.println(st);

        System.out.println();

        sort(st);
        System.out.println("Stack after sorting: ");
        System.out.println(st);

    }
}
