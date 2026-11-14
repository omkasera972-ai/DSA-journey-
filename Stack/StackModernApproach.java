package Stack;

import java.util.*;

public class StackModernApproach {
    static void main() {

        Deque<Integer> st = new ArrayDeque<>();

        // push
        st.push(10);
        st.push(20);
        st.push(30);

        IO.println("Stack:- " + st);
        IO.println("Stack size:- " + st.size());

        // peek
        IO.println("Stack peek:- " + st.peek());

        // pop
        IO.println("Stack pop:- " + st.pop());

        // check empty
        IO.println("Stack empty:- " + st.isEmpty());

        // updated stack
        IO.println("Updated stack:- " + st);
    }
}
