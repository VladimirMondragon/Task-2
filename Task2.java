import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Original String
        String str = " Welcome to the Java String Lab! ";

        // 1. For Loop: Count Vowels
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);

        // 2. While Loop: Check for Palindrome
        String word = "racecar"; // Example word
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;

    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }

    if (isPalindrome) {
        System.out.println("The word '" + word + "' is a palindrome.");
    } else {
        System.out.println("The word '" + word + "' is NOT a palindrome.");
    }

    // 3. Do...While Loop: Input Validation
    Scanner scanner = new Scanner(System.in);
    String userInput;

    do {
        System.out.print("Enter a sentence containing the word 'Java': ");
        userInput = scanner.nextLine();
    } while (!userInput.contains("Java"));

    System.out.println("Thank you!");

    scanner.close(); // Close the scanner to avoid resource leak
}
}