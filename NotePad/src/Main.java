import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to write today?");
        String input = scanner.nextLine();

        // Metni dosyaya yazma
        try {
            FileWriter fileWriter = new FileWriter("notlar.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(input);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Dosyadan metni okuma
        try {
            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println("Last saved text: " + readText);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}