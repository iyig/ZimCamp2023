package day10_ifStatement;
import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        // Kullanicidan gun isimlerini aliniz
        // Haftaici mi ; Haftasonu mu oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next();
        /*
        String datalar icin == sembolu hem degre hem de referance'a yani  adrese baktigi icin dogru calismaz
        Bu nedenle String datalarin birbirine esit olup olmadigini equals() methodu ile kontrol ederiz
         */

        //1 Yol
        if(gunIsmi.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu");
        }else if(gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasonu");
        }else if(gunIsmi.equalsIgnoreCase("Pazartesi")){
            System.out.println("Haftaici");
        }else if(gunIsmi.equalsIgnoreCase("Sali")){
            System.out.println("Haftaici");
        }else if(gunIsmi.equalsIgnoreCase("Carsamba")){
            System.out.println("Haftaici");
        }else if(gunIsmi.equalsIgnoreCase("Persembe")){
            System.out.println("Haftaici");
        }else if(gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici");
        }else{
            System.out.println("Lutfen Gecerli Bir Gun Ismi Giriniz");
        }

        // 2.Yol

        if(gunIsmi.equalsIgnoreCase("Cumartesi") ||gunIsmi.equalsIgnoreCase("Pazar") ){
            System.out.println("Haftasonu");
        }else if(gunIsmi.equalsIgnoreCase("Pazartesi")
                ||gunIsmi.equalsIgnoreCase("Sali")
                ||gunIsmi.equalsIgnoreCase("Carsamba")
                ||gunIsmi.equalsIgnoreCase("Persembe")
                ||gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici");
        }else{
            System.out.println("Lutfen Gecerli Bir Gun Ismi Giriniz");
        }

        // 3.Yol  Makbul Olani budur
        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi")
                ||gunIsmi.equalsIgnoreCase("Sali")
                ||gunIsmi.equalsIgnoreCase("Carsamba")
                ||gunIsmi.equalsIgnoreCase("Persembe")
                ||gunIsmi.equalsIgnoreCase("Cuma");
        boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi")
                ||gunIsmi.equalsIgnoreCase("Pazar");

        if(haftaIci){
            System.out.println("HaftaIci");
        } else if (haftasonu) {
            System.out.println("Haftasonu");
        }else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


    }
}