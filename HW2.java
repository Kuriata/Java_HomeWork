package HW2;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {

        System.out.println("1 Sort them by DESC(reverseOrder)");
        int[] с = {1, 9, 93, 18, 3, 17, 6, 11, 6};
        Arrays.sort(с);
        Arrays.toString(с);

        for (int i = с.length - 1; i >= 0; i--)

            System.out.println(с[i] + " ");

        System.out.println("2 Average numbers");

        int[] d = {-15, 3, 16, 9, -1, 5};
        int n = 0;

        for (int i:d){
            n+=i;
        }
        System.out.println((double)n/ d.length);

        System.out.println("3 PositiveNumbers");

        int[] a = {1, 5, 16, -33, 7, -100, 104};
        int b = 0;

        for (int i: a){
            if (a.length == 0) {
                System.out.println(b);
            }
            else if(i>0){
                b+=i;
            }
        }
        System.out.println(b);

        System.out.println("4 Replace duplicated");

        int[] f = {9, 18, 33, 9, 1, 6, 6, 15, 18};

        for (int i = 0; i < f.length; i++) {
            for (int j = i + 1; j < f.length; j++) {
                if (f[i] == f[j]) {
                    f[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(f));
    }
}
