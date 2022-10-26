package com.cursor;

public class Kuriata {
    public static void main(String[] args) {

        byte a = 2;
        byte b = 2;
        int c = (a + b) * b;
        System.out.println(c);

        byte d = (byte) 130;

        System.out.println(d + 15);

        double r = 13.3;
        double s = 19.456;
        double t =  r * s;

        System.out.println(t--);
        System.out.println(t--);
        System.out.println(++t);

        float e = 15.0f;
        float f = 2.0f;
        float g = e % f;

        System.out.println(g);

        boolean isWeekend = true;

        if (isWeekend){
            System.out.println("Cool");
        }else{
            System.out.println("Need to work");
        }

        long bb =  15;
        int bc = (int) (bb * 2);
        System.out.println(bc);

        char aa = 67;
        char ab = 85;
        char ac = 82;
        char ad = 83;
        char ae = 79;
        char af = 82;

        System.out.println(aa);
        System.out.println(ab);
        System.out.println(ac);
        System.out.println(ad);
        System.out.println(ae);
        System.out.println(af);


    }
}
