package task9;

public class OutputMain {
    public static void main(String[] args) {

        Giraffe giraffe = new Giraffe();
        giraffe.getName();

        Rhinoceros rhinoceros = new Rhinoceros();
        rhinoceros.getName();

        Swim swim = new Giraffe();
        swim.swim1();

        Jump jump = new Giraffe();
        jump.jump1();

        Swim swim2 = new Rhinoceros();
        swim2.swim1();
    }
}
