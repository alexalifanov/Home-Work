package Task9;

public class Rhinoceros extends Animal implements Swim {
    @Override
    public void getName() {
        System.out.println("Rico");
    }
    @Override
    public void swim1() {
        System.out.println("Rico swim");
    }
}
