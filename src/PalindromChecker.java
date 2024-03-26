import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String userInput = scanner.nextLine();

        // Check if the entered word is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println("Yes, the word is a palindrome.");
        } else {
            System.out.println("No, the word is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase
        word = word.toLowerCase();

        // Initialize a StringBuilder to store the reversed word
        StringBuilder reversedWord = new StringBuilder();

        // Reverse the word and append it to the StringBuilder
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        // Check if the original word is equal to its reverse
        return word.equals(reversedWord.toString());
    }
}
