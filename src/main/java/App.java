// yousaffuentes-cop3330-ex19

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Please enter your weight in pounds: ");
            String weightInput = s.nextLine();
            int weight = Integer.parseInt(weightInput);

            System.out.println("Please enter your height in inches: ");
            String heightInput = s.nextLine();
            int height = Integer.parseInt(heightInput);

            double bmi = ( 1.00 * weight / (height * height)) * 703;

            if (bmi >= 18.5 && bmi <= 25)
                System.out.println(String.format("Your BMI is %.1f.\nYou are within the ideal weight range.", bmi));
            else if (bmi > 25)
                System.out.println(String.format("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", bmi));
        } catch (NumberFormatException ex) {
            System.out.println("Enter numbers only.");
        };


    };
};
