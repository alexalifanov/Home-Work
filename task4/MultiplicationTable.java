package task4;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Таблица пифагора");
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++){
                System.out.printf("%5d", a * b);
            }
            System.out.println();
        }
    }
}
