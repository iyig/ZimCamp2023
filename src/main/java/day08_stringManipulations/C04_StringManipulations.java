package day08_stringManipulations;

public class C04_StringManipulations {
    public static void main(String[] args) {
        //******************************* replaceAll()  ********************************\\
        /*
        bir grup datayi degistirmek icin replaceAll() methodu kullanilir
        bir grup Dataya Regular Expression (Regex) kullanilir

        En cok Kullanilan Regexler
        1) Tum Rakamlar ==>[0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum       harfler ==> [a-zA-Z]
        5) Tum       harfler+rakamlar  ==> [a-zA-Z0-9]
        6) Tum  sesli  harfler  ==> [aeiouAEIOU]
        7) Tum  noktalama isaretleri  ==> \\p{Puncht}   ==>punchtuation noktalama isareti
        8 ) Tum Space   == >[ ]

        ^ ==> den farkli; haricinde
        1) Tum Rakamlar Haricinde ==>[^0-9]
        2) Tum kucuk harfler Haricinde==> [^a-z]
        3) Tum buyuk harfler Haricinde==> [^A-Z]
        4) Tum       harfler Haricinde==> [^a-zA-Z]
        5) Tum       harfler+rakamlar Haricinde ==> [^a-zA-Z0-9]
        6) Tum  sesli  harfler Haricinde ==> [^aeiouAEIOU]
        7) Tum  noktalama isaretleri  Haricinde==> [^\\p{Punct}]  ya da   [\\P{P}]  ==>punctuation noktalama isareti
        8 ) Tum Space   == >[ ]
         */
        //Ex :s String'indeki tum rakamlari '*' ceviriniz
        String s = "Mehmet QA DEV kursunda 23 yasinda 110000$ kazanmistir...";
        System.out.println(s.replaceAll("[0-9]", "*"));//once degisecek data sonra ne getirilecegi yazilir
        //Ex : s String'indei Datada tum harflerin ve rakamlarin yerine '@' yerlestiriniz
        System.out.println(s.replaceAll("[a-zA-Z0-9]", "@"));
        //@@@@@@ @@ @@@ @@@@@@@@ @@ @@@@@@@ @@@@@@$ @@@@@@@@@@@...

        //Ex: s String'indeki tum space'ler disindaki karakterleri '+' isareti ile degistiriniz
        System.out.println(s.replaceAll("[^ ]", "+"));
        //++++++ ++ +++ ++++++++ ++ +++++++ +++++++ ++++++++++++++
        //Ex: s String'indeki tum kucuk harfler disindaki karakterleri '*' isareti ile degistiriniz
        System.out.println(s.replaceAll("[^a-z]", "*"));
        //*ehmet********kursunda****yasinda*********kazanmistir***
        //Ex: s String'indeki tum sesli harfler disindaki karakterleri '&' isareti ile degistiriniz
        System.out.println(s.replaceAll("[^aeiouAEIOU]", "&"));
        //&e&&e&&&A&&E&&&u&&u&&a&&&&&a&i&&a&&&&&&&&&&a&a&&i&&i&&&&

    }
}
