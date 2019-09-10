package Task3;

import java.util.Scanner;

public class NewSalary {
    public static void main(String[] args) {
        Scanner dirtysalary = new Scanner(System.in);
        System.out.println("Введите уровень зароботной платы");
        int Scanner = dirtysalary.nextInt();
        double VAT13 = 0.13;
        double  VAT = Scanner* VAT13;
        double  netsalary = Scanner - VAT;
        System.out.println(netsalary + " RUB");

    }
}
