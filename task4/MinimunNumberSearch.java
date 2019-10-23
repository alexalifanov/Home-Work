package task4;

import java.util.Scanner;

public class MinimunNumberSearch {
    public static void main(String[] args) {
        System.out.println("Введите два любых числа для сравнения!");
        Scanner number = new Scanner(System.in);
        int firstNumber = number.nextInt();
        int secondNumber = number.nextInt();
        if (firstNumber > secondNumber)
            System.out.println("Второе число меньше первого!");
        if (firstNumber < secondNumber)
            System.out.println("Первое число меньше второго!");
        if (firstNumber == secondNumber)
            System.out.println("Они равны!");
        System.out.println("Готово!");
    }

}
