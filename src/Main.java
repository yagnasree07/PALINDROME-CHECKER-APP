import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Welcome Message and App Details
        System.out.println("=====================================");
        System.out.println("      WELCOME TO PALINDROME CHECKER  ");
        System.out.println("=====================================");
        System.out.println("App Name   : Palindrome Checker");
        System.out.println("Version    : 1.0");
        System.out.println("Developer  : Your Name");
        System.out.println("Description: This app checks whether");
        System.out.println("             a word or number is a");
        System.out.println("             palindrome or not.");
        System.out.println("=====================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: ✅ It is a Palindrome!");
        } else {
            System.out.println("Result: ❌ It is NOT a Palindrome.");
        }

        scanner.close();
    }
}