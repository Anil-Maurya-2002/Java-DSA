package Aapna_College_DSA.Stacks;

import java.util.*;

public class Stack_Collection_Frameworks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        st.size();

        while(!st.isEmpty()) {
//            System.out.println(st.pop());
            System.out.println(st.peek());
            st.pop();
        }
    }
}

