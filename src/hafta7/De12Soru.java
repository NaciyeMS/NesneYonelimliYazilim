package hafta7;

public class De12Soru {
    /* Aşağıdaki adımları izleyerek bir De12Soru isimli Java sınıfı oluşturun.
     * Bu sınıfta, farklı türlerde birim dönüşümleri gerçekleştiren metodları 
     * overload edeceksiniz. Bu sınıfta, farklı türlerde birim dönüşümü yapan
     * metodları overload edin.
     * 
     * Overload Edilecek Metodlar:
     * 
     * convert(double kilometre): Kilometreyi mile çevirir.
     * Dönüşüm formülü: kilometre * 0.621371
     * 
     * convert(int feet): Ayak uzunluğunu metreye çevirir.
     * Dönüşüm formülü: feet * 0.3048
     * 
     * convert(double celsius, String tur): Celsius'u Fahrenheit'e çevirir.
     * Dönüşüm formülü: (celsius * 9/5) + 32.
     * Bu metod sadece ikinci parametre olarak "fahrenheit" verilirse çağrılacak.
     * 
     * convert(double kilogram, int hassasiyet): Kilogramı pound'a çevirir
     * ve sonucu verilen ondalık hassasiyette döndürür.
     * Dönüşüm formülü: kilogram * 2.20462.
     * hassasiyet parametresi, sonucu kaç ondalık basamakla göstereceğinizi belirtir.
     * 
     * main metodunda bu metodları kullanarak farklı birim dönüşümleri yapın
     * ve sonuçları ekrana yazdırın.
     */

    public static void main(String[] args) {
        convert(10.0);             // Kilometre -> Mil
        convert(10);               // Feet -> Metre
        convert(37.0, "fahrenheit"); // Celsius -> Fahrenheit
        convert(100.0, 2);         // Kilogram -> Pound (2 basamak)
    }

    // 1. Kilometreyi mile çeviren metod
    public static double convert(double kilometre) {
        double mil = kilometre * 0.621371;
        System.out.println("Kilometre -> Mil: " + mil);
        return mil;
    }

    // 2. Ayak uzunluğunu metreye çeviren metod
    public static double convert(int feet) {
        double metre = feet * 0.3048;
        System.out.println("Ayak -> Metre: " + metre);
        return metre;
    }

    // 3. Celsius'u Fahrenheit'e çeviren metod
    public static double convert(double celsius, String tur) {
        double fahrenheit = 0;
        if (tur.equalsIgnoreCase("fahrenheit")) {
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Celsius -> Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Desteklenmeyen dönüşüm türü!");
        }
        return fahrenheit;
    }

    // 4. Kilogramı pound'a çeviren metod (ondalık hassasiyetli)
    public static String convert(double kilogram, int hassasiyet) {
        double pound = kilogram * 2.20462;
        String format = "%." + hassasiyet + "f";
        String sonuc = String.format(format, pound);
        System.out.println("Kilogram -> Pound (" + hassasiyet + " ondalık basamak): " + sonuc);
        return sonuc;
    }
}