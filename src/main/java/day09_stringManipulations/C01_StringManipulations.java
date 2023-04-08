package day09_stringManipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // **************************** split () ***************************\\
        /*
        Istenilen yerden datayi parcalar.Arrayler ile cok daha fazla kullanilir.
         */
        // Ex: Verilen tamIsim String'inin lk ismin ilk harfi ile son ismin ilk harfini
        // buyuk harf olarak yanyana yazdiran kodu olusturunuz
        //  input : Akif Gurkan   output : AG
        String tamIsim = " Aysegul yilmazer";//AY
        char first = tamIsim.trim().toUpperCase().charAt(0);

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("Ismin IlkHarfi+Soyadin Ilk Harfi : "+first+second);


    }//main
}
