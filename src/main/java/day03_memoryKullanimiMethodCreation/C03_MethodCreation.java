package day03_memoryKullanimiMethodCreation;
public class C03_MethodCreation {
    public static void main(String[] args) {
/*
    methodlar main disinda olusturulur.
    Access  + static + Return Type+ MethodIsmi+ (argumanlar)+ { }
    Modifier
 */
        toplamaYap(55,10);
        // Ex: Verilen iki sayiyi carpan bir method olusturunuz
        System.out.println("carpmaYap ==> "+carpmaYap(5,8));
        // Ex : Dikdortgenin alanini hesaplayan methodu olusturunuz
        System.out.println("dikdortgeninAlani ==> "+dikdortgeninAlani(6, 90));
        //EX : Verilen bir ondalikli sayinin kupunu yazdiran methodu olusturunuz  7.8 verilsin
        kupunuAl(7.8);
        // Ex : Dikdortgenin Cevresini hesaplayan methodu olusturunuz  2*(a+b);
        dikdortgeninCevresi(45,89);
    }//main
    static void dikdortgeninCevresi(int a, int b) {
        System.out.println(2*(a+b));
    }
    static void kupunuAl(double a) {
        System.out.println("kupunuAl ==> "+a*a*a);
    }
    public static double dikdortgeninAlani(int a, int b) {
        return a*b;
    }
    private static int carpmaYap(int a, int b) {
        return a*b;
    }
    public static void toplamaYap(double a, double b) {
        System.out.println("toplamaYap ==> "+(a+b));
    }
}//class
