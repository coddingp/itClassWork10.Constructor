package com.company;


public class Rectangle {
    int a;
    int b;

    public static int sqrt(int a, int b) {
        return a * b;
    }

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    public void setA(int firstSide) {
        if (firstSide > 0) {
            this.a = firstSide;
        } else {
            System.out.println("Сторона А должна быть больше 0");
        }
    }

    public int getA() {
        if (a > 0) {
            return a;
        }
        return 0;
    }

    public void setB(int secondSide) {
        if (secondSide > 0) {
            this.b = secondSide;
        } else {
            System.out.println("Сторона В должна быть больше 0");
        }
    }

    public int getB() {
        return b;
    }

}
