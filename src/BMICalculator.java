import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        final double KGS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double lbs = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double kgs = lbs * KGS_PER_POUND;
        double meters = inches * METERS_PER_INCH;

        double bmi = kgs / Math.pow(meters, 2);

        System.out.printf("BMI is %.2f%n", bmi);

    }

}
