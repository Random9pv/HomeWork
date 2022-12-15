package HomeWork5.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String test1 = "C:\\Users\\Пк\\IdeaProjects\\Lesson\\src\\HomeWork5\\My_Firt_file.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(test1));) {

            bufferedWriter.write("Моя бабушка" + " ");
            bufferedWriter.write("читает газету жизнь");
        }

    }
}
