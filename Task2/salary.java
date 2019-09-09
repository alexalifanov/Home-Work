package Task2;

public class salary {
    public static void main(String[] args) {
        int dirtysalary = 70000;
        double VAT13 = 0.13;
        double  VAT = dirtysalary * VAT13;
        double  netsalary = dirtysalary - VAT;
        System.out.println(netsalary + " RUB");
    }
}

