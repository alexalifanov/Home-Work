package task14;

import org.apache.log4j.Logger;

import java.util.Scanner;


public class VendingMachine1 extends Logics {
    final static Logger logger = Logger.getLogger(VendingMachine1.class);
    public static void main(String[] args) {
        logger.info("Начало программы");
        Menu1();
        logger.info("Выбор продукта");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите денежные средства согласно стоимости выбранного напитка");
        int money = scanner.nextInt();
        logger.info("Деньги внесены");
        if (money > 0) {
            choice();
        } else {
            System.out.println("Вы не внесли деньги");
            logger.info("Отсутствуют средства");
        }
        process(money);
        logger.info("Завершение программы");
    }

}

