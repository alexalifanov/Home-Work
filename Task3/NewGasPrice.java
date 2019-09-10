package Task3;

import java.util.Scanner;

public class NewGasPrice {
    public static void main(String[] args) {
        Scanner GasolineVolume = new Scanner(System.in);
        System.out.println("Введите необходимый объем топлива");
        int Scanner = GasolineVolume.nextInt();
        int GasolinePrice = 43;
        System.out.println(Scanner * GasolinePrice + " RUB");
    }
}
