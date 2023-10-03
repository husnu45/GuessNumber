import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 0 , max = 100 , guessLimit = 10 , guessCount = 0 , guess = -1;


        int randomNumber = random.nextInt(max - min + 1) + min;



        System.out.println("Aklımdan 0-100 Arasında Bir Sayı Tuttum.");
        System.out.println("Bu Sayıyı Bulabilir misin ? Merak etme her tahmin sonrasında sana ipucu vereceğim.");
        System.out.println("Toplam " + guessLimit + " tahmin hakkınız kaldı.");

        while (guess != randomNumber && guessCount < guessLimit) {
            System.out.print("Tahmininizi giriniz : ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < min || guess > max) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
            } else if (guess < randomNumber) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (guess > randomNumber) {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }

        if (guess == randomNumber) {
            System.out.println("Tebrikler! " + guess + " sayısını " + guessCount + " deneme sonunda tahmin etmeyi başardınız.");
        } else {
            System.out.println("Tahmin hakkınız doldu. Doğru cevap: " + randomNumber + " idi.");
        }

        scanner.close();
    }
}
