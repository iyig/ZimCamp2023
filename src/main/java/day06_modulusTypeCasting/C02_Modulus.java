package day06_modulusTypeCasting;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {

        /*

       Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakaminin toplamini
        yazdiran kodu olusturunuz.

        INPUT : 1234                4698
        OUTPUT : 1+4 =5             4+8 =12


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int number = input.nextInt();

        // 1 ler basamagini alabilmek icin %10
        int birlerBas = number%10;
        System.out.println("birlerBas = " + birlerBas);

        int binlerBas = number/1000;
        System.out.println("binlerBas = " + binlerBas);
        System.out.println("Toplam : "+(birlerBas+binlerBas));




    }
}
