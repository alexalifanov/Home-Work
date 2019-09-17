package Task3;

import java.util.Random;
import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println(randomNumber);
        int previousNumber = 0;
        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("Введите случайное чило от 1 до 100");
            int currentNumber = number.nextInt();

            if (currentNumber == randomNumber) {
                System.out.println("Ты выиграл!");
                break;
            }
            if ((Math.abs(previousNumber - randomNumber)) > (Math.abs(currentNumber - randomNumber))) {
                System.out.println("Горячо!");
            }
            if ((Math.abs(previousNumber - randomNumber)) < (Math.abs(currentNumber - randomNumber))) {
                System.out.println("Холодно!");
            }
        }
    }
}
