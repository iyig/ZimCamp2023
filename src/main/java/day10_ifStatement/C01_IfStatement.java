package day10_ifStatement;

public class C01_IfStatement {
    public static void main(String[] args) {
        // INTERWIEW QUESTIONS
        // Verilen String'deki tekrarsiz karakterleri ekrana yazdiriniz
        // String str ="abbccdc";
        String str = "abb";
        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch);
        }

        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2 = str.charAt(2);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

    /*
    if Statement : Bazi kodlarin calismasi belirli sartlara baglidir.
    Bu durumda if Statement yapisi kullanilir.
    Duzenli ,disiplinli calisirsam ; iyi bir IT'ci olacagim.

    if(Duzenli ,disiplinli calisirsam){
            iyi bir IT'ci olacagim.
    }
     */


        // Verilen sayi pozitif ise ekrana "Pozitif" yazdiran kodu olusturun
        int sayi = 0;
        if (sayi > 0) {
            System.out.println("Pozitif");
        }
        System.out.println("*** Hic Bir sey yazdirmadi***************");

        // Ex : -1 ile 10 arasinda ekrana "Rakam" yazdiran kodu yaziniz
        int number = 2;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }
        //EX : Sayi uc basamakli ise ekrana 3 basamakli yazdiran kodu olusturunuz

        int n = -269;
        n = Math.abs(n);

        if (n > 99 && n < 1000) {
            System.out.println("Sayi 3 Basamaklidir");
        }

//ctrl + alt +l
    }
}
