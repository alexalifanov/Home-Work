package task30;

import java.util.Scanner;

public class Reiteration {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        System.out.println("First symbol " + searchSymbol(letter));
    }


    private static String searchSymbol(String text) {
        String total = null;
        for (int i = 0; i < text.length(); i++) {
            char char1 = text.charAt(i);
            if (text.indexOf(char1) == text.lastIndexOf(char1)) {
                total = Character.toString(char1);
                break;
            }
        }
        return total;
    }
}
