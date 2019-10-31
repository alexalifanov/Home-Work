package task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileWork {
    public static void main(String[] args) throws IOException {
        File file = new File("ABC.txt");
        file.createNewFile();
        file.renameTo(new File("CBA.txt"));
        File file1 = new File("CF.txt");
        file1.createNewFile();
        copyFiles(file, file1);
        file.delete();
        recursive(new File("C:\\Users\\Alexei.Alifanov\\IdeaProjects\\ru.alifanov\\src"));
    }

    private static void copyFiles(File file, File file1) throws IOException {
        Files.copy(file.toPath(), file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void recursive(File root) {
        if (root != null && root.exists()) {
            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    recursive(new File(file.getAbsolutePath()));
                    System.out.println("Dir: " + file.getAbsoluteFile());
                } else {
                    System.out.println("File: " + file.getAbsoluteFile());
                }
            }
        }
    }
}