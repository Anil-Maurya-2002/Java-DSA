package Aapna_College_DSA.Stacks;

import java.util.*;

public class Stack_Reverse {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        else {
            int temp = s.pop();
            pushAtBottom(s, data);
            s.push(temp);
        }
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        else {
            int top = s.pop();
            reverse(s);
            pushAtBottom(s, top);
        }
    }


    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


