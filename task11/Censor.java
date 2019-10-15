package task11;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        censorship();
    }
    private static void censorship () {
        Scanner phrase = new Scanner(System.in);
        System.out.println("Введите фразу");
        String string = phrase.next();
        System.out.println(string.replaceAll("(?iu)бяка","вырезано цензурой"));
    }
}

