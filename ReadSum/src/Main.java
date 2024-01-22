import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Toplamı tutacak bir değişken oluşturuyoruz.
        int total = 0;

        try {
            // Dosyayı okumak için FileReader oluşturuyoruz.
            FileReader readFile = new FileReader("patika.txt");

            // Dosyayı satır satır okumak için BufferedReader oluşturuyoruz.
            BufferedReader readBuffer = new BufferedReader(readFile);

            // Dosyanın ilk satırını okuyoruz.
            String line = readBuffer.readLine();

            // Dosyanın sonuna kadar okuma işlemine devam ediyoruz.
            while (line != null) {
                // Okunan satırı tam sayıya dönüştürüp toplama ekliyoruz.
                total += Integer.parseInt(line);

                // Sonraki satırı okuyoruz.
                line = readBuffer.readLine();
            }

            // Toplamı ekrana yazdırıyoruz.
            System.out.println("Total = " + total);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}