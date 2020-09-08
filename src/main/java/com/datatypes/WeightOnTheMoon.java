package com.datatypes;

import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        double personWeight = weight.nextDouble();
        double weightOnTheMoon = personWeight * 0.17;
        System.out.println(weightOnTheMoon);
    }
}
