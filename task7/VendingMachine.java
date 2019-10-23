package task7;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("MENU");
        for (MenuSheet menuSheet : MenuSheet.values()){
            System.out.println(menuSheet + " " + menuSheet.price + " " + menuSheet.currency);
        }
        System.out.println("Пожалуйста внесите денежные средства");
        Scanner money = new Scanner(System.in);
        int cash = money.nextInt();
        if (cash > 0) {
            System.out.println("Чтобы купить LAYS введите 1");
            System.out.println("Чтобы купить SNICKERS введите 2");
            System.out.println("Чтобы купить SKITTLES введите 3");
            System.out.println("Чтобы купить HARIBO введите 4");
            System.out.println("Чтобы купить KINDER введите 5");
            System.out.println("Чтобы купить MENTOS введите 6");
            System.out.println("Чтобы купить MELLER введите 7");
            System.out.println("Чтобы купить OREO введите 8");
            System.out.println("Чтобы купить NESQUIK введите 9");
            System.out.println("Чтобы купить MILKA введите 10");
        }
        else {
            System.out.println("Вы не внесли денежные средства");
        }
        int position = money.nextInt();
        switch (position) {
            case 1: MenuSheet.LAYS.getPrice();
            if (cash >= MenuSheet.LAYS.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 2: MenuSheet.SNICKERS.getPrice();
            if (cash >= MenuSheet.SNICKERS.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 3: MenuSheet.SKITTLES.getPrice();
            if (cash >= MenuSheet.SKITTLES.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 4: MenuSheet.HARIBO.getPrice();
            if (cash >= MenuSheet.HARIBO.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 5: MenuSheet.KINDER.getPrice();
            if (cash >= MenuSheet.KINDER.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 6: MenuSheet.MENTOS.getPrice();
            if (cash >= MenuSheet.MENTOS.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 7: MenuSheet.MELLER.getPrice();
            if (cash >= MenuSheet.MELLER.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 8: MenuSheet.OREO.getPrice();
            if (cash >= MenuSheet.OREO.getPrice()){
                System.out.println("Приятного аппетикта");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 9: MenuSheet.NESQUIK.getPrice();
            if (cash >= MenuSheet.NESQUIK.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;
            case 10: MenuSheet.MILKA.getPrice();
            if (cash >= MenuSheet.MILKA.getPrice()){
                System.out.println("Приятного аппетита");
            }
            else {
                System.out.println("Недостаточно средств");
            }
            break;

        }
    }
}
