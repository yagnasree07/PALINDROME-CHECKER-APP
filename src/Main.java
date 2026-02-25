import java.util.Scanner;

public class PalindromeLinkedList {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        Node head = null, tail = null;
        for(char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if(head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        boolean isPalindrome = true;

        while(secondHalf != null) {
            if(firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if(isPalindrome)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");

        sc.close();
    }
}
