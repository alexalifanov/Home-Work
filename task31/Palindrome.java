package task31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word to verify: ");
        String line = scanner.nextLine();
        System.out.println(standardFunctionPalindrome(line));
        System.out.print(movingPalindrome(line));
    }

    private static boolean movingPalindrome(String s1) {
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    private static boolean standardFunctionPalindrome(String s2) {
        StringBuilder stringBuilder = new StringBuilder(s2);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(s2);
    }
}
