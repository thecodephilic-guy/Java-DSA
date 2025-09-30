package recursion.get_started;

import java.util.Stack;

public class ReverseStack {
    public static void insert(Stack<Integer> st, int value){
        if(st.isEmpty()){
            st.push(value);
            return;
        }

        int top = st.pop();
        insert(st, value);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() == 1) return;

        int top = st.pop();
        reverse(st);
        insert(st, top);
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

        reverse(st);
        System.out.println("Stack after sorting: ");
        System.out.println(st);
    }
}
