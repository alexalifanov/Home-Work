package Task3;

import java.util.Scanner;

public class NewWatch {
    public static void main(String[] args) {
        Scanner second = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int Scanner = second.nextInt();
        int secondsinminute = 60;
        int minuteinhour = 60;
        int secondsinhour = secondsinminute * minuteinhour;
        int hours = Scanner / secondsinhour;
        System.out.println(hours + " hr");
    }
}
