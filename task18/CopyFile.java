package task18;

import java.io.*;
import java.nio.charset.Charset;

public class CopyFile {
    public void NewFile() throws IOException{
        File file = new File("Trial");
        file.mkdir();
        //Метод mkdir является частью класса File и используется для
        //создания нового каталога Trial, обозначенного абстрактным путем.
        File file1 = new File("Trial/real.txt");
        file1.createNewFile();
        //создание нового файла real с расширением .txt в каталоге Trial
        Writer writer = new BufferedWriter(new FileWriter("Trial/unreal.txt"));
        writer.write("написать программу копирования");
        writer.close();
    }
    public void Change() throws IOException{
        File fileIn = new File("Trial\\real.txt");
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(fileIn), Charset.forName("cp866"))) {
            FileReader fileReader = new FileReader("Trial\\unreal.txt");
            int tx;
            while ((tx = fileReader.read()) != -1) {
                writer.write(tx);
            }
        }
        BufferedReader reader = new BufferedReader(new FileReader("Trial/real.txt"));
        System.out.println(reader.readLine());
    }
}
