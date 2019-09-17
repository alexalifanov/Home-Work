package Task4;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        System.out.println("Введите любое число!");
        Scanner number = new Scanner(System.in);
        int selectedNumber = number.nextInt();
        if (selectedNumber % 2 == 0 && selectedNumber != 0)
            System.out.println("Четное число!");
        if (selectedNumber % 2 != 0)
            System.out.println("Нечетное число!");
        if (selectedNumber > 0)
        System.out.println("Число положительное!");
        if (selectedNumber < 0)
            System.out.println("Число отрицательное!");
        if (selectedNumber == 0)
            System.out.println("Вы ввели ноль!");
    }
}
