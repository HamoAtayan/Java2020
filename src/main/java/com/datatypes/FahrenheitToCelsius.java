package com.datatypes;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner fahrenheit = new Scanner(System.in);
        double fahrenheitDegree = fahrenheit.nextDouble();
        Double celsius = (fahrenheitDegree - 32) * 5 / 9;
        System.out.println(celsius + "C");
    }
}
