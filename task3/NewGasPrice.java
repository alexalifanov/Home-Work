package task3;

import java.util.Scanner;

public class NewGasPrice {
    public static void main(String[] args) {
        Scanner gasolineVolume = new Scanner(System.in);
        System.out.println("Введите необходимый объем топлива");
        int scanner = gasolineVolume.nextInt();
        int gasolinePrice = 43;
        System.out.println(scanner * gasolinePrice + " RUB");
    }
}
