package com.datatypes;

import com.helpers.CommonHelper;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  08, Sep, 2020
 */
public class BiggestNumber {
    private static final Scanner scanner = CommonHelper.getScanner();

    public static void main(String[] args) {

        System.out.print("please enter first number: ");
        int a = scanner.nextInt();
        System.out.print("please enter second number: ");
        int b = scanner.nextInt();
        System.out.print("please enter third number: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("biggest number is: " + a);
        }
        System.out.println("biggest number is: " + Math.max(b, c));
    }
}
