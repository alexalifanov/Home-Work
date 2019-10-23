package task2;

public class salary {
    public static void main(String[] args) {
        int dirtySalary = 70000;
        double vat13 = 0.13;
        double  vat = dirtySalary * vat13;
        double  netSalary = dirtySalary - vat;
        System.out.println(netSalary + " RUB");
    }
}

