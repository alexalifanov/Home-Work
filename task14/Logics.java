package task14;

import java.util.Scanner;

public class Logics {
    public static void Menu1() {
        System.out.println("MENU");
        for (Menu menu : Menu.values()) {
            System.out.println(menu + " " + menu.price + " " + menu.currency);
        }
    }
    public static void choice() {
        System.out.println("Выберите продукт");
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
    public static void process(int money) {
        Scanner position = new  Scanner(System.in);
        int number = position.nextInt();
        switch (number){
            case 1: Menu.LAYS.getPrice();
                if (money >= Menu.LAYS.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 2: Menu.SNICKERS.getPrice();
                if (money >= Menu.SNICKERS.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 3: Menu.SKITTLES.getPrice();
                if (money >= Menu.SKITTLES.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 4: Menu.HARIBO.getPrice();
                if (money >= Menu.HARIBO.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 5: Menu.KINDER.getPrice();
                if (money >= Menu.KINDER.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 6: Menu.MENTOS.getPrice();
                if (money >= Menu.MENTOS.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 7: Menu.MELLER.getPrice();
                if (money >= Menu.MELLER.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 8: Menu.OREO.getPrice();
                if (money >= Menu.OREO.getPrice()){
                    System.out.println("Приятного аппетикта");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 9: Menu.NESQUIK.getPrice();
                if (money >= Menu.NESQUIK.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
            case 10: Menu.MILKA.getPrice();
                if (money >= Menu.MILKA.getPrice()){
                    System.out.println("Приятного аппетита");
                }
                else {
                    System.out.println("Недостаточно средств");
                }
                break;
        }

    }
}
