import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }
}
