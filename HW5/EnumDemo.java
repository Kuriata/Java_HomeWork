package HW5;

import java.util.Random;

public class EnumDemo {
//    public static void main(String[] args) {
//       Apple apple = Apple.Cortland;
//       Apple apple1 = Apple.Jonathan;

//       System.out.println("The apple is Cortland " + apple.getPrice());
//       System.out.println("Cortland is" + apple.ordinal());

//        if (apple == Apple.Cortland) {
//            System.out.println("The apple is Cortland");
//        }
//
//        switch (apple){
//            case Cortland:
//                System.out.println("Cortland is red");
//                break;
//            case Jonathan:
//                System.out.println("Jonathan is green");
//                break;
//        }

//        Apple[] apples = Apple.values();
//        for (Apple a: apples) {
//            System.out.println(a);
//        }

//        Apple[] apples = Apple.values();
//        for (Apple a: apples) {
//            System.out.println(a.ordinal());
//        }
//        for (Apple a: Apple.values()) {
//            System.out.println(a);
//        }
//        System.out.println("-----");
//        Apple apple2 = Apple.valueOf("Cortland");
//        System.out.println(apple2);

    //public static void main(String[] args) {
//    int a = 0;
//    int b = 23 / a;
//    System.out.println("SAdsadasd " + b);
//}

    public static void main(String[] args) {
        int a = 12345, b = 25, c = 5;
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
                System.out.println(" a = " + a);
            } catch (ArithmeticException e) {
                System.out.println("a = 0");
            } finally {
                System.out.println("Finally block ERROR. Iteration number: " + i);
            }
        }
        System.out.println("a = " + a);
    }
}

