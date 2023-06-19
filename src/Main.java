import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meters;
        boolean inputValid;

        do {
            System.out.println("Enter a measurement in meters: ");
            if (!in.hasNextDouble()) {
                System.out.println("Invalid. Please enter a valid number.");
                in.nextLine();
                inputValid = false;
            } else {
                meters = in.nextDouble();
                if (meters < 0) {
                    System.out.println("Invalid. Please enter a positive number.");
                    inputValid = false;
                } else {
                    inputValid = true;

                    double miles = meters * 0.000621371;
                    double feet = meters * 3.28084;
                    double inches = meters * 39.3701;

                    System.out.println("Miles: " + miles);
                    System.out.println("Feet: " + feet);
                    System.out.println("Inches: " + inches);
                }
            }
        }
        while (!inputValid);
    }
}
