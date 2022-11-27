package HW5;

public enum Apple implements Comparable<Apple> {
    JONATHAN(15), GOLDANDEL, REDDEL(8), Winesap(17), Cortland(20);
    private int price;
    Apple(int price) {
        this.price = price;
    }

    Apple() {
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
