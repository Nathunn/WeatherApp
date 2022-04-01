package org.example;

public class Euclid {

    public static int gcdDivision(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcdRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursion(b, a % b);
    }

    public static int gcdSubtraction(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        //sout = System.out


        System.out.println(Euclid.gcdDivision(14, 58));
        System.out.println(Euclid.gcdRecursion(14, 58));
        System.out.println(Euclid.gcdSubtraction(14, 58));

    }
}
