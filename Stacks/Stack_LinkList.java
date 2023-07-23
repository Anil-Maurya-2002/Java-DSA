package Aapna_College_DSA.Stacks;

import java.util.Stack;
import java.util.concurrent.RecursiveTask;

public class Stack_LinkList {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null ;

        // push
        public static void push (int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
        }


        // poop
        public static boolean isEmpty(){
            return head == null;
        }
        public static int poop() {
            if (isEmpty()) {
                return -1;
            } else {
                Node top = head;
                head = head.next;
                return top.data;
            }
        }


        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main (String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.poop();
        }
    }
}
