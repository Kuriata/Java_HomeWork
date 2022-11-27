package HW6;

import java.util.LinkedList;

public class DoublyLL {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();

        System.out.println("-----isEmpty true-----");
        System.out.println(number.isEmpty());

        number.add(183);
        number.add(176);
        number.add(116);
        number.add(136);
        number.add(247);

        System.out.println("-----Size-----");
        System.out.println(number);
        System.out.println(number.size());

        System.out.println("-----addFirst-----");
        number.addFirst(11);
        System.out.println(number);
        System.out.println(number.size());

        System.out.println("-----addLast-----");
        number.addLast(1212);
        System.out.println(number);

        System.out.println("-----add(Index)-----");
        number.add(1, 21);
        System.out.println(number);

        System.out.println("-----isEmpty false-----");
        System.out.println(number.isEmpty());

    }
}
