import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display menu options
            System.out.println("Choose one from each category:");
            System.out.println("Entrees: 1. Tofu Burger $3.49  2. Cajun Chicken $4.59  3. Buffalo Wings $3.99  4. Rainbow Fillet $3.99");
            System.out.println("Side Dishes: 1. Rice Cracker $0.79  2. No-Salt Fries $0.69  3. Zucchini $1.09  4. Brown Rice $0.99");
            System.out.println("Drinks: 1. Cafe Mocha $1.99  2. Cafe Latte $1.99  3. Espresso $2.49  4. Oolong Tea $0.99");

            // Input
            System.out.print("Enter your entree choice (1-4): ");
            int entree = scanner.nextInt();

            System.out.print("Enter your side dish choice (1-4): ");
            int side = scanner.nextInt();

            System.out.print("Enter your drink choice (1-4): ");
            int drink = scanner.nextInt();

            double total = 0.0;

            // Entree
            switch (entree) {
                case 1: total += 3.49; break;
                case 2: total += 4.59; break;
                case 3: total += 3.99; break;
                case 4: total += 3.99; break;
                default: System.out.println("Invalid entree choice.");
            }

            // Side
            switch (side) {
                case 1: total += 0.79; break;
                case 2: total += 0.69; break;
                case 3: total += 1.09; break;
                case 4: total += 0.99; break;
                default: System.out.println("Invalid side dish choice.");
            }

            // Drink
            switch (drink) {
                case 1: total += 1.99; break;
                case 2: total += 1.99; break;
                case 3: total += 2.49; break;
                case 4: total += 0.99; break;
                default: System.out.println("Invalid drink choice.");
            }

            System.out.printf("Total Price: $%.2f\n", total);
         }
    }