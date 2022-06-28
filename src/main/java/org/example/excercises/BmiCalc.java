package org.example.excercises;

public class BmiCalc {
    public static void main(String[] args) {
        double weight = 85;
        float height = 1.80f;

        float bmi = (float) (weight / Math.pow(height,2));
        System.out.println("BMI: " + bmi);

        int bmiConverted = (int) bmi;
        System.out.println("BMI jako int: " + bmiConverted);
    }
}
