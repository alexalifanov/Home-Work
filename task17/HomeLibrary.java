package task17;

import java.io.*;

public class HomeLibrary {
    void bookToLibrary(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //создаем переменную br которая содержит ссылку на символьный поток, связанный с консолью
            //через поток ввода System.in
            BufferedWriter bw = new BufferedWriter(new FileWriter("HomeLibrary.txt", true));
            //BufferWriter записывает текст в буфер,чтобы обеспечить
            // эффективную запись символов через FileWriter на диск
            String text;
            System.out.println("Введите название книги, ее автора и год издания");
            while (!(text = br.readLine()).equals("esc")){
                bw.write(text + "\n");
                //Осуществление переноса строки после каждого элемента библиотеки
                System.out.println("Введите esc для выхода, или добавьте еще одну позицию");
                bw.flush();
                //Запись в память
            }
            bw.close();
            br.close();
            //Осуществление закрытия потоков bw и br
        }catch (IOException x){
            x.getMessage();
        }
    }
    void libraryToList(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("HomeLibrary.txt"));
            // Прочитать данные в буфер из файла HomeLibrary.txt
            String name;
            while ((name = reader.readLine()) != null) {
                // Считывать из файла пока будет результат
                System.out.println(name);
                //Выводитьь на консоль считанные данные из библиотеки
            }
            reader.close();
            // Остановить поток считывания
        }catch (IOException y){
            y.getMessage();
        }
    }
}
