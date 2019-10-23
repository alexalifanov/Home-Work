package task8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner operands = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        System.out.println("Что вы хотите сделать? '1 +', '2 -', '3 *', '4 /', '5 %'");
        int operatOr = operator.nextInt();
        System.out.println("Введите первое число");
        double firstNumber = operands.nextDouble();
        System.out.println("Введите второе число");
        double secondNumber = operands.nextDouble();
        Operator operator1 = new Operator(firstNumber, secondNumber);

        switch (operatOr){
            case (1):
                System.out.println(operator1.addition(firstNumber, secondNumber));
                break;
            case (2):
                System.out.println(operator1.subtraction(firstNumber, secondNumber));
                break;
            case (3):
                System.out.println(operator1.multiplication(firstNumber, secondNumber));
                break;
            case (4):
                System.out.println(operator1.division(firstNumber, secondNumber));
                break;
            case (5):
                System.out.println(operator1.percent(firstNumber, secondNumber));
        }
    }
}
