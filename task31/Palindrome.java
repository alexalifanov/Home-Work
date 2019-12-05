package task31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word to verify: ");
        String line = scanner.nextLine();
        // System.out.println(stringFunctionPalindrome(line));
        System.out.print(lineMovePalindrome(line));
    }

    private static boolean lineMovePalindrome(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (i != 0) {
                if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                    return false;
                } else {
                    System.out.println("you entered nothing");
                }
            }
        }
        return true;
    }

    private static boolean stringFunctionPalindrome(String text) {
        if (text != null) {
            StringBuilder stringBuilder = new StringBuilder(text);
            stringBuilder.reverse();
        } else {
            System.out.println("you entered nothing");
        }
        return true;
    }
}
