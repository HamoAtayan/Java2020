package com.datatypes;

import com.helpers.CommonHelper;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  08, Sep, 2020
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = CommonHelper.getScanner();
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else
            System.out.println("odd");

        System.out.println("bye");
    }
}
