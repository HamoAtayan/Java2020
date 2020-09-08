package com.datatypes;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  07, Sep, 2020
 */
public class Table {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please type number for axyusak:");
        printAxyusak(scanner.nextInt());
    }
    public static void printAxyusak(int a){
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * "+  i + " = " + a * i);
        }
    }
}
