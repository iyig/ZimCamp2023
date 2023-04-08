package day09_stringManipulations;

public class C04_StringManipulations {
    public static void main(String[] args) {
        // Bir String Datadaki noktalama isaretlerinin sayisini veren kodu yaziniz
        String cumle = "Sen@ yok musun?, sen!...";
        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("number = " + number);//7


        // ************************** indexOf() *************************\\
        /*
        Verilen karakter ya da karakerlerin ilk gorunumunun index'inin verir.
        Tek karakter icinde coklu karakter icinde kullanilabilir.Coklu karakterde ilk karakterin indexini dondurur
         */
        // Ex:
        String str = "Kara kara dusunme Ankara";
        int index = str.indexOf("kara");
        System.out.println("index = " + index);// 5

        // *********************** lastIndexOf() **************************\\
        /*
        Verilen karakterin son gorunumunun indexini verir
         */
        int lastIndex = str.lastIndexOf("kara");//20
        System.out.println("lastIndex = " + lastIndex);//20

        String s = "Mississippi";
        int idx = s.indexOf('i');
        System.out.println("idx = " + idx);//1
        int lastIdx = s.lastIndexOf('i');
        System.out.println("lastIdx = " + lastIdx);//10
        // Bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //        //           "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli
        String t = "Helloooo";
        char ch='l';

        if( t.indexOf(ch) == t.lastIndexOf(ch)){
            System.out.println("Tekrarsiz");

        }else {
            System.out.println("Tekrarli");
        }

    }//main
}