import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
    }
}
}
