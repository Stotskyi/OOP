import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RandomNumberFile {
    public static void main(String[] args) {
        // Отримуємо параметри командного рядка
        if (args.length != 4) {
            System.out.println("Usage: java RandomNumberFile <filename> <numberCount> <minValue> <maxValue>");
            return;
        }

        String filename = args[0];
        
        // Перевірка існування файлу      
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        // Запис послідовності випадкових чисел у файл
        Write write = new Write(file,args);
        write.WriteToFile();

        // Читання інформації з файлу та виведення на консоль
        Read read = new Read(file);
        read.ReadFromFile();
    }
    
    

   
}

//javac RandomNumberFile.java
//java RandomNumberFile myfile.txt 10 1 100
