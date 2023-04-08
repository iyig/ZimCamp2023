package day04_objectCreationScanner;

public class Car {
    /*

    Class ==> Variable      ==>Object Creation
              Methodlar

     */

    public String model="Toyota";
    public int fiyat= 2000000;
    public void hareket(){
        System.out.println("Toyota guvenle hareket eder");
    }
    public void dur(){
        System.out.println("Toyota guvenle durur");
    }
    public void vitesDegistir(int a){
        System.out.println("Toyota "+a+" .vitese alindi");
    }
}
