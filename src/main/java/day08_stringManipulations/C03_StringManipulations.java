package day08_stringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {
        // *********************** replace()*****************\\
    /*
    Metnin icerisindeki bir karakter ya da karakerlerin
    yerine baska bir karakter ya da karakterlerin yerlestirilmesini saglar
    bize String data dondurur
    */
        // Ex: s String'inde "money" kelimesi yerine "dollar" kelimesi yerlestiriniz
        String s ="Learn Java earn money";
        System.out.println(s.replace("money", "dollar"));
        //Learn Java earn dollar

        // Ex : s String'indeki 'a' harfini '*' ile degistiriniz
        System.out.println(s.replace('a', '*'));//Le*rn J*v* e*rn money

        // Ex : s String'indeki 'L' harfini  "***" ile degistiriniz
        System.out.println(s.replace("L", "***"));//***earn Java earn money

        // Ex : s String'indeki 'e' harflerini siliniz
        System.out.println(s.replace("e", ""));

        // Ex : s String'indeki "earn" kelimesini siliniz
        System.out.println(s.replace("earn", ""));//L Java  money
        // Ex: t String'indeki "Kalem" kelimesi yerine "Dolma" yerlestiriniz
        String t ="Dolma Kalem";
        System.out.println(t.replace("Kalem", "Dolma"));//Dolma Dolma
    }
}
