package com.maxrichter.lib;

import java.util.Scanner;


    // all of these codes get information from users/
    public class MyClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your name");
            String name = sc.nextLine();
            System.out.println("please enter your gender");
            String gender = sc.nextLine();
            System.out.println("please enter your age");
            int age = sc.nextInt();
            System.out.println("please enter your weight(kg)");
            double weight = sc.nextDouble();
            System.out.println("please enter your height(meter)");
            double height = sc.nextDouble();
            double BMI = bmi(weight, height);//this code calls bmi function
            System.out.println("your BMI result is:" + BMI);//this code prints the string locating in the braces beside the BMI calculating by bmi function.
            bmiConditions(BMI);//this code calls function bmiConditions

        }

        /**
         * this function calculates user's bmi rate.
         * @param a is the weight
         * @param b is the height
         * @return
         */
        public static double bmi(double a, double b) {
            double resultBmi = 0;
            resultBmi = a / (b * b);
            return (resultBmi);
        }

        /**
         * the method is calculater phycical healthy
         * @param resultBmi
         */
        public static void bmiConditions(double resultBmi) {
            if (resultBmi < 18.5) {
                System.out.println("you are underweight");
            } else if (resultBmi >= 18 && resultBmi < 25) {
                System.out.println("you are normal weight");
            } else if (resultBmi >= 25 && resultBmi < 30) {
                System.out.println("you are overweight");
            } else if (resultBmi >= 30 && resultBmi < 35) {
                System.out.print("you are fat");
            } else if (resultBmi >= 35 && resultBmi < 40) {
                System.out.print("you are exterme overweight");
            } else if (resultBmi >= 40) {
                System.out.print(" obesity");

            }
        }




}
