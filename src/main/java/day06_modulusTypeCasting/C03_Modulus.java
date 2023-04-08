package day06_modulusTypeCasting;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
       /*
       INTERWIEW QUESTIONS
       Kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2
        rakamlarinin toplamini hesaplatan kodu yaziniz
         INPUT : 12345
         OUTPUT : 1+2+4+5= 12
        */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();


        // Son basamagi al
        int birler = number%10;
        System.out.println("birler = " + birler);
        // Sayiyi kucult
        number=number/10;
        System.out.println("kuculen number = " + number);//1234

        // *************************** \\

        // Sondan ikinci basamagi al
        int onlarBas=number%10;

        //Sayiyi kucult
        number =number/10;//123

        // Sondan ucuncu basamai al
        int yuzlerBas = number%10;

        //Sayiyi kucult
        number =number/10;//12

        //Sondan 4 rakami al
        int binlerBas = number%10;

        // Sayiyi kucult
        int onBinlerBas= number/10;//1

        System.out.println("Toplam : "+(onBinlerBas+binlerBas+onlarBas+birler));











    }
}
