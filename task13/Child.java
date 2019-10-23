package task13;

import java.util.Scanner;

public class Child {
    public void eat() throws NotTastyFood {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будешь кушать?");
        String food = scanner.next();
        if (ChildrenMenu.Name(food)){
            System.out.println("Съел за обе щеки");
        }
        else {
            throw new NotTastyFood("Спасибо мама!");
        }
    }
}
