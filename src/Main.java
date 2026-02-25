import java.util.Scanner;

public class PalindromeIgnoreCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while(start < end) {
            if(input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");

        sc.close();
    }
}