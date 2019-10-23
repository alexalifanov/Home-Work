package task4;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int a1=5, d=2, an;
        for (int n=2; n <= 10; n++ ){
        an = a1 + d * (n - 1);
            System.out.println(an);
        }
    }
}
