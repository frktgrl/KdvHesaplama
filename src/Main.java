import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvYuzdesi, kdvTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz:");
        tutar = input.nextDouble();
        kdvYuzdesi = (tutar <= 1000)? 0.18 : 0.08; //ürünün fiyatı 1000 TL'den düşükse kdv %18, değilse kdv %8
        kdvTutar = tutar * kdvYuzdesi;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv Tutarı: "+ kdvTutar);
        System.out.print("Kdvli Tutar: " + kdvliTutar);





    }
}
