package Aapna_College_DSA.Stacks;

import java.util.*;

public class Stack_ArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }


        // push
        public void push(int data) {
            list.add(data);
        }


        // poop
        public int poop() {
            if (isEmpty()) {
                return -1;
            }
            else {
//            int top = list.get(list.size()-1);     // get
//            list.remove(list.size()-1);           // then remove
                int top = list.remove(list.size() - 1);  // above two line can replace by singal line
                return top;
            }
        }


        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            else {
                return list.get(list.size() - 1);
            }
        }
    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while ((!Stack.isEmpty())) {
//        System.out.println(s.peek());
//        s.poop();

            System.out.println(s.poop());
            System.out.println(s.poop());
//            System.out.println(s.push());

        }
    }
}


