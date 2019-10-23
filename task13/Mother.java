package task13;

public class Mother {
    public static void main(String[] args) {
        Child child = new Child();
        try {
            child.eat();
            System.out.println("Спасибо мама");
        }
        catch (NotTastyFood ex){
            System.out.println(ex.getMessage());
        }
    }
}
