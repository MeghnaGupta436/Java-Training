import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Print the parallelogram pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

