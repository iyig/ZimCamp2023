package day04_objectCreationScanner;

public class Runner {

    public static void main(String[] args) {
        // Object Nasil Olusturulur?
        // Class      Object      =      new         Constructor () ==Anne, muteahit
        // Ismi       Ismi
        Car         corolla     =      new         Car();

        System.out.println(corolla.fiyat);
        System.out.println(corolla.model);
        corolla.hareket();
        corolla.dur();
        corolla.vitesDegistir(2);

        Student gulce = new Student();
        System.out.println(gulce.name);
        System.out.println(gulce.grade);
        System.out.println(gulce.adress);
        gulce.study();
        gulce.feed();
        gulce.sleep();


    }//main
}//class
