import java.util.*;

public class PalindromeDeque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Character> deque = new ArrayDeque<>();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

        sc.close();
    }
}
