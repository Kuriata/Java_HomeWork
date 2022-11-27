package HW6;

import java.util.LinkedList;
import java.util.Queue;

public class DoublyLL_Queue {
    public static void main(String[] args) {
        Queue<String> stack = new LinkedList<>();

        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");
        stack.add("Five");

        System.out.println("-----isEmpty-----");
        System.out.println(stack.isEmpty());   //false
        System.out.println("-----Enqueue-----");
        System.out.println(stack);
        System.out.println("-----Size-----");
        System.out.println("All stack: " + stack.size());
        System.out.println("-----Dequeue-----");
        while (!stack.isEmpty()) {
            System.out.println(stack.remove());
        }

    }
}