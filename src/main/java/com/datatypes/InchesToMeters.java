package com.datatypes;

import java.util.Scanner;

public class InchesToMeters {

    public static void main(String[] args) {
        Scanner inches = new Scanner(System.in);
        double inch = inches.nextDouble();
        double meter = inch * 0.0254;
        System.out.println(meter);
    }
}

