package task19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Receipt {
    public void ReceiptOut() throws IOException{
        File products = new File("C:\\Users\\Alexei.Alifanov\\IdeaProjects\\ru.alifanov\\src\\task19\\Products");
        Scanner productsInf = new Scanner(products);
        Float amount = 0f;
        while (productsInf.hasNext()){
            String line = productsInf.nextLine();
            Float x = productsInf.nextFloat();
            Float y = productsInf.nextFloat();
            Float z = y * x;
            amount += z;
            System.out.printf("%-16s %8.2f x %7.2f =%10.2f\n", line, y, x, z);
            if (productsInf.hasNext())
                productsInf.nextLine();
        }
        String total = "Итого:";
        System.out.printf("%s %40.2f", total, amount);
    }
    public void ReceiptInf(){
        String a = "Позиция";
        String b = "Цена";
        String c = "Количество";
        String d = "Стоимость";
        System.out.printf("%s  %16s %12s %10s \n", a, b, c, d);
    }
}
