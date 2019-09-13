package Task3;

import java.util.Scanner;

public class NewSalary {
    public static void main(String[] args) {
        Scanner dirtySalary = new Scanner(System.in);
        System.out.println("Введите уровень зароботной платы");
        int scanner = dirtySalary.nextInt();
        double vat13 = 0.13;
        double  vat = scanner* vat13;
        double  netSalary = scanner - vat;
        System.out.println(netSalary + " RUB");

    }
}
