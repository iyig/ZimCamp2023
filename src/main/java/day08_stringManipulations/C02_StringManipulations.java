package day08_stringManipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
        // *************** contains() icermek *************************\\

        /*

        String bir Datada belirli bir karakter ya da karakterlerin
        olup olmadigini return eder.true ya da false olarak boolean sonuc verir
         */
        String str="Kara kara Ankara";
        System.out.println(str.contains("kara"));//true
        System.out.println(str.contains("yara"));//false
        System.out.println(str.contains("ak"));//false
        System.out.println(str.contains("a k"));//true

        // ***************** startsWith() ***************\\
        /*
        Metnin bas kisminin istenilen karakter ya da karakterlerle baslayip baslamdigini kontrol eder.
        Bize boolean sonuc dondurur
         */
        // String str="Kara kara Ankara";
        System.out.println(str.startsWith("kara"));//false
        System.out.println(str.startsWith("Kara"));//true

        // Ex: Universite numaralari = yil+bolumKodu+ o bolume kacinci siradan girildigi
        // olarak duzenlene bir okulda ogrenci Esra'nin Hukuk Fakultesine gidip gitmedigini
        // gosteren kodu yaziniz
        /*
        Sinif Ogretmenligi 22
        Kimya 33
        Hukuk 44
        Tip 55
        Esra studentId = 20085506
         */
        String str2= "20085506";
        System.out.println(str2.startsWith("44", 4));//false
        /*
        prefix : baslangic demek offset at gitsin ilk 4 karakterden sonra "44" ile basliyormu diye bakildi
         */

        String str3= "20204401";
        System.out.println(str3.startsWith("44", 4));//true

        // ********************* endsWith () *********************\\

        /*
        Metnin son kisminin istenilen karakter ya da karakterlerle bitip bitmedigini kontrol eder.
        true ya da false seklinde Bize boolean sonuc dondurur.
         */
        //  Ex : Verilen cumle'nin "money" ile bitip bitmedigini kontrol eden kodu yaziniz
        String cumle = "Learn Java earn money";
        System.out.println(cumle.endsWith("money"));//true
        System.out.println(cumle.endsWith("moNey"));//false
        //Ex: Verilen mail adresinin .com ile bitip bitmedigini kontrol eden kodu olusturunuz
        String mail ="fatih@gmail.com";
        System.out.println(mail.endsWith(".com"));//true

        //Ex : mail adresinin @ isareti icerip icermedigini kontrol eden kodu yaziniz
        System.out.println(mail.contains("@"));//true

    }//main
}