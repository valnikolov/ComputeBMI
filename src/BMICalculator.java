import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        final double KGS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInLBS = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        double weightInKGS = weightInLBS * KGS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;

        double bmi = weightInKGS / Math.pow(heightInMeters, 2);

        System.out.printf("BMI is %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }

}
