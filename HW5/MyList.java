package HW5;

import java.util.ArrayList;

public class MyList<IK extends Number> {
    ArrayList<IK> numer = new ArrayList<>();

    public void add(IK nums) {
        numer.add(nums);
    }

    public IK max() {
        IK max = numer.get(0);

        for (int i = 0; i < numer.size(); i++) {
            if (max.intValue() < numer.get(i).intValue()) {
                max = numer.get(i);
            }
        }
        return max;
    }

    public IK min() {
        IK min = numer.get(0);

        for (int i = 0; i < numer.size(); i++) {
            if (min.intValue() > numer.get(i).intValue()) {
                min = numer.get(i);
            }
        }
        return min;
    }

    public void printArray() {
        for (int i = 0; i < numer.size(); i++) {
            numer.get(i);
        }
        String d = numer.toString();
        System.out.println("Number is: " + d);
    }
}
