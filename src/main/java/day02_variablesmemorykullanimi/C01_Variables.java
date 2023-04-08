package day02_variablesmemorykullanimi;
public class C01_Variables {
    public static void main(String[] args) {
        //Ex 1: Dunya nufusunu icine yerlestireceginiz bir variable olusturunuz.9000000000
        long wordofPopulation = 9000000000L;
        long sayfaSayisi = 235499999;
        //Not long data type'ini Java Integer kabul etme eyilimindedir.
        // Biz israr edersek L ya da l sayinin sonuna eklemeliyiz
        //Ex 2: char data type'inde ilk ismin ilk harfi seklinde bir variable olusturunuz.
        char initialize='F';
        char space =' ';
        char sembol = '*';
        // char hiclik = '';  char data type inin icine mutlaka 1 karakter yerlestirilmeli.
        // Ne hiclik nede 1 den fazla karakter yerlestirilemez
        // Ex 3 : boolean data type'inda emeklimisin variable olusturup false atayalim.
        boolean emeklimisin = false ;
        // Ex 4: Site nufusu icin bir variable olusturup bir deger atayalim  1200
        short siteNufusu=1200 ;
        // Ex 5 : Gomlek ve ayakkabi fiyatlari icin 2 tane variable olusturup toplam fiyati ekrana yazdiriniz
        float gomlek = 555.68987F;
        float ayakkabi = 6663.4678F;
        System.out.println("gomlek+ayakkabi fiyati : "+(gomlek+ayakkabi));
        System.out.print("gomlek fiyati : "+gomlek);
        System.out.println("ayakkabi fiyati : "+ayakkabi);
        System.out.println("Bugra");
        System.out.println("************************************");
        System.out.println("emeklimisin : "+emeklimisin);
        System.out.println("space : "+space+"space yazdirdimi?");
    }//main
}
