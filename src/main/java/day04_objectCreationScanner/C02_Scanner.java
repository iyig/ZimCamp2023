package day04_objectCreationScanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip
        Dikdortgenin Cevre ve Alan hesabini yapan kodu yaziniz
        Cevre = 2 * (kisa+uzun)
        Alan = kisa*uzun
         */

        Scanner input = new Scanner(System.in);//AhmetSaat
        System.out.println("Lutfen kisa kenar uzunlugunu giriniz");//4
        int kisa = input.nextInt();
        System.out.println("Lutfen uzun kenar uzunlugunu giriniz");//8
        int uzun = input.nextInt();

        System.out.println(" Dikdortgenin Cevresi : "+(2*kisa+2*uzun));
        System.out.println(" Dikdortgenin Alani : "+ kisa*uzun);

        /*
        Kullanicidan alacaginiz data ile ucgenin
        cevresini hesaplatan kodu yaziniz
        UcgenCevre=a+b+c;
         */

        Scanner input2=new Scanner(System.in);//Bugra Sirtas
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        byte a = input2.nextByte();
        byte b = input2.nextByte();
        byte c = input2.nextByte();
        int cevre = a+b+c;
        System.out.println("cevre = " + cevre);

        System.out.println("cevre = " + (a+b+c));







    }//main
}//class
