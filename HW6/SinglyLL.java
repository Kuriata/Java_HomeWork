package HW6;

import java.util.Stack;

public class SinglyLL {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Січень");
        stack.push("Лютий");
        stack.push("Березень");
        stack.push("Квітень");
        stack.push("Травень");
        stack.push("Червень");
        stack.push("Липень");
        stack.push("Серпень");
        stack.push("Вересень");
        stack.push("Жовтень");
        stack.push("Листопад");
        stack.push("Грудень");

        System.out.println("All Stack" + stack);
        System.out.println(stack.size());
        System.out.println("--------PUSH--------");
        System.out.println(stack);
        System.out.println("--------PEEK--------");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("--------POP--------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println("--------isEmpty--------");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
