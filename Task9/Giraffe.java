package Task9;

public class Giraffe extends Animal implements Swim, Jump {
    @Override
    public void getName() {
        System.out.println("Melman");
    }
    public void swim1(){
        System.out.println("Melman run");
    }
    @Override
    public void jump1() {
        System.out.println("Melman jump");
    }
}
