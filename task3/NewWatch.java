package task3;

import java.util.Scanner;

public class NewWatch {
    public static void main(String[] args) {
        Scanner second = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int scanner = second.nextInt();
        int secondsInMinute = 60;
        int minuteInHour = 60;
        int secondsInHour = secondsInMinute * minuteInHour;
        int hours = scanner / secondsInHour;
        System.out.println(hours + " hr");
    }
}
