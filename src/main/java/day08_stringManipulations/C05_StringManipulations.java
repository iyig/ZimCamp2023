package day08_stringManipulations;

public class C05_StringManipulations {
    public static void main(String[] args) {
        // ******************* replaceFirst() *********************\\
        /*
        replaceFirst() reolace() ile ayni isi yapar
        Ancak sadece ilk gordugu datayi degistirir
         */
        String cumle ="Java ogrenmek techpro ile cok zevkli...";
        // Ex: cumle String'indeki ilk gordugu 'i' harfi yerine 'e' yerlestiriniz
        System.out.println(cumle.replaceFirst("i", "e"));//Java ogrenmek techpro ele cok zevkli...

        // ********************** trim()**************************\\
        /*
        trim bastaki ve sondaki space bosluklari siler
        Kullanici hatalarini onler. Ortadaki space'lere dokunmaz Sadece bastaki ve sondakini siler
         */
        System.out.print("**************");
        String isim=" Hayriye Kartin  ";
        System.out.print("**************");
        System.out.print(isim.trim());
        System.out.println("****************************");
        //EX : Asagida verilen urunlerin toplam fiyatini veren kodu yaziniz
        String tv= "599.99TL";
        String utu="299.99TL";
        String tv2= tv.replace("TL","");//"599.99"
        System.out.println("tv2 = " + tv2);
        String utu2 =utu.replace("TL","");//"299.99"
        System.out.println("utu2 = " + utu2);
        Double totalPrice = Double.valueOf(tv2) +Double.valueOf(utu2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98




    }
}
