import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz:" );
        double boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        double kilo = input.nextDouble();
         double sonuc = kilo/boy*boy;

        System.out.println("Vücut Kitle İndeksiniz:"+ sonuc);



    }
}
