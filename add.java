import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("Enter first number: ");
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
        } else {
            System.out.println("No input provided, using default value 10.");
            num1 = 10;
        }

        System.out.println("Enter second number: ");
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
        } else {
            System.out.println("No input provided, using default value 20.");
            num2 = 20;
        }

        System.out.println("Sum: " + (num1 + num2));
        sc.close();
    }
}

