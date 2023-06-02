import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Select a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(length, breadth);

                System.out.println("The area of Rectangle is " + rectangle.getArea());
                System.out.println("I have " + rectangle.getSides() + " " + "Sides.");
            } else if (choice == 2) {
                System.out.print("Enter side length: ");
                double side = scanner.nextDouble();

                Square square = new Square(side);

                System.out.println("The area of Square is " + square.getArea());
                System.out.println("I have " + square.getSides() + " " + "Sides.");
                System.out.println("I can get Sides of a Polygon.");
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice! Please try again with a correct number after careful reading🤬.");
            }

            System.out.println();
        } while (true);

        scanner.close();
    }
}
