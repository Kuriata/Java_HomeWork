package HW5;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();


        myList.add(105);
        myList.add(188);
        myList.add(10001);
        myList.add(-13);
        myList.add(-2105);
        myList.add(10555);
        myList.add(10);

        myList.printArray();

        System.out.println("Maximum number is: " + myList.max());
        System.out.println("-----");
        System.out.println("Minimum number is: " + myList.min());

    }
}
