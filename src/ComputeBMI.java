import java.util.Scanner;

public class ComputeBMI {

    public static void main(String[] args) {

        final double LBS_TO_KG_CONVERSION_FACTOR = 0.45359237;
        final double IN_TO_METERS_CONVERSION_FACTOR = 0.0254;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double lbs = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double kgs = lbs * LBS_TO_KG_CONVERSION_FACTOR;
        double meters = inches * IN_TO_METERS_CONVERSION_FACTOR;

        double bmi = kgs / Math.pow(meters, 2);

        System.out.printf("BMI is %.2f%n", bmi);

    }

}
