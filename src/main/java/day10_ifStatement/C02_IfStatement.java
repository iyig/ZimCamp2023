package day10_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        // Verilen harf buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz
     /*   char ch = 'Z';

        if(ch>='A' && ch<= 'Z'){
            System.out.println("Buyuk Harf");
        }

        // Ex: Verilen bir sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu olusturunuz
        byte sayi = 0;
        if(sayi%2 ==0){
            System.out.println("Cift Sayi");
        }

        // Ex : Verilen bir sayi 300'den kucuk veya 1200'den
        // buyuk ise ekrana "Harika Sayi" yazdiran kodu olusturunuz
        int number =1201;
        if(number<300 || number>1200){
            System.out.println("Harika Sayi");
        }

        // Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();
        if(num%2 ==0){
            System.out.println("Cift Sayi");
        }
        if(num%2 != 0){
            System.out.println("Tek Sayi");
        }*/
        /*
        Bagimsiz if bloklari 2 kez calisirken if else statement
         ayni kod blogunu 1 kez calisarak olusturdu
         */
        // 2.Yol
      /*  if(num%2 == 0){
            System.out.println("Cift Sayi");
        }else{// Geriye kalan tum ihtimaller
            System.out.println("Tek Sayi");
        }

        */

        // Verilen bir sayinin negatif mi , pozitif mi, notr mu? oldugunu kontrol eden kod blogunu yaziniz
        int n = 0;
        if(n>0){
            System.out.println("Pozitif Sayi");
        }else if(n ==0){
            System.out.println("Notr Sayi");
        }else{
            System.out.println("Negatif Sayi");
        }

    }//main
}
