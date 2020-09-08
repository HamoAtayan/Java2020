package com.datatypes;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  08, Sep, 2020
 */
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter floating number: ");
        float a = scanner.nextFloat();
        if (a == 0) {
            System.out.println("zero");
        } else if (a > 0) {
            System.out.println("the number is positive");
            if (a > 1000000) {
                System.out.println("large");
            }
        } else {
            System.out.println("the number is negative");
            System.out.println("small");
        }
    }
}
