public class PalindromeUC2 {

    public static void main(String[] args) {


        System.out.println("=== UC2: Hardcoded Palindrome Check ===");


        String word = "madam";


        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome.");
        }


        System.out.println("Program Exits.");
    }
}