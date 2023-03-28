package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        double radiusOfSCircle;
        double areaOfCircle;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radiusOfSCircle = input.nextDouble();
        input.close();

        areaOfCircle = Circle.getArea(radiusOfSCircle);
        System.out.println("The area of a circle of radius " + radiusOfSCircle + "is: " + areaOfCircle);
    }
}
