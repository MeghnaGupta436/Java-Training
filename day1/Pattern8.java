import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }
            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(num--);
            }
            // Move to the next line
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
