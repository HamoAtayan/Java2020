package com.datatypes;

import com.helpers.CommonHelper;

import java.util.Scanner;

/**
 * Created by Hmayak Atayan on  07, Sep, 2020
 */
public class CityDistance {
    static Scanner scanner = CommonHelper.getScanner();
    static double d;

    public static void main(String[] args) {
        System.out.println("type the coordinates of cities");
        cityDistance(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("type the coordinates of cities");
        mediumDot(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }

    public static void cityDistance(double cityOneX, double cityOneY, double cityTwoX, double cityTwoY) {
        d = Math.sqrt(Math.pow(cityTwoX + cityOneX, 2)) + ((cityTwoY - cityOneY) * (cityTwoY - cityOneY));
        System.out.println("the lenght is " + d);
    }

    public static void mediumDot(double cityOneX, double cityOneY, double cityTwoX, double cityTwoY) {
        double mediumX = (cityOneX + cityTwoX) / 2;
        double mediumY = (cityOneY + cityTwoY) / 2;
        System.out.println("mediumX is :" + mediumX + "medium Y is: " + mediumY);
    }
}
