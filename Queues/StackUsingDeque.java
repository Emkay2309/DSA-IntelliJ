package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data) {
            deque.addLast(data);
        }
        public static int pop() {
            return deque.removeLast();
        }
        public static int  peek() {
            return deque.getLast();
        }

    }
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());

    }
}
