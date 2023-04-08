package day04_objectCreationScanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {


        // Kullanicidan Data Alabilmek icin
        // 1) input object olustururuz
        Scanner input = new Scanner(System.in);//Cihan
/*
        // 2)Kullaniciyi yonlendirmeliyiz
        System.out.println("Lutfen adinizi giriniz");

        // 3) Kullanicidan alinan Data'nin yapisina ve buyuklugune gore bir variable secilir
        String name = input.next();
        //4) Kullanicinin verdigi bilgileri teyit edebilmesi icin ekrana yazdirin
        System.out.println(name);

        /*
        Kullaniciya adini,cinsiyetini,memleketini,yasini,boyunu,
        emekli Olup Olmadigini,maasini soran kodu yaziniz
         */
        // 2)Kullaniciyi yonlendirmeliyiz
        System.out.println("Lutfen adinizi giriniz");
        // 3) Kullanicidan alinan Data'nin yapisina ve buyuklugune gore bir variable secilir
        String ad = input.nextLine();
        // next() ilk ismi alir ; nextLine() tum satiri alir
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K ,Erkek icin E giriniz");
        char cinsiyet=input.next().charAt(0);
        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy= input.nextDouble();
        System.out.println("Emeklimisin? Evetse True \n Hayirsa False giriniz");
        boolean emekliMi = input.nextBoolean();
        System.out.println("Lutfen maasinizi  giriniz");
        long maas= input.nextLong();

        System.out.println("************** Bora Bayuk ****************");
        System.out.println(" ad : " + ad+" cinsiyet : "+cinsiyet+" memleket :"+
                memleket+" yas :"+yas+" boy :"+boy+" emekliMi"+emekliMi+" maas :"+maas);

    }//main
}//class
