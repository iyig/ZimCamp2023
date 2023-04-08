package day08_stringManipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // ************ substring() ***********************\\

        /*
        substring () iki sekilde kullanilir
        i) substring (int baslangicIndexi , int bitisIndexi)
        baslangic indexi dahil , bitis indexi haric dondurur,yazdirir.
        ii)substring (int baslangicIndexi)  sadece baslangic indexi yazilir.
         bitis belirtilmedigi icin String'in sonuna kadar tamamini dondurur
         */

        String str ="Benim Tek Rakibim Dunku Ben";
        // Ex: Verilen str Datadaki ilk 5 karakteri yazdiriniz
        System.out.println(str.substring(0, 5));//Benim  [0,5)

        // Ex: Verilen str Datadaki 4.index dahil 7 index haric yazdiran kodu yaziniz
        System.out.println(str.substring(4, 7));//m T

        //Ex : str String'indeki Datadan "Rakib" kelimesini veren kodu yaziniz
        System.out.println(str.substring(10, 15));

        System.out.println(str.substring(10));//Rakibim Dunku Ben
        // Verilen String Datadaki sadece meyve isimlerini yazdiran kodu olusturunuz
        String cumle ="Ben erik, oglum muz ,kizim sever cilek";// (4,8)  (16,19) (33,37)
        String erik =cumle.substring(4, 8);
        String muz = cumle.substring(16,19);
        String cilek = cumle.substring(33);
        System.out.println(erik + " " + muz + " " +cilek);//erik muz cilek



    }//main
}//class
