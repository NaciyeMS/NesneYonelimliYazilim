package hafta7;

public class De13Soru {
/*Aşağıdaki adımları izleyerek bir De13Soru isimli Java sınıfı oluşturun. 
 * Bu sınıfta, değişken sayıda sayıları işleyen metodlar tanımlayacaksınız.
 * Aşağıda belirtilen metodları varargs kullanarak yazın:
 * 
 * findMax(int... numbers): Girilen sayılar arasındaki en büyük sayıyı bulur.
 * findMin(int... numbers): Girilen sayılar arasındaki en küçük sayıyı bulur.
 * calculateAverage(double... numbers): Girilen sayılar arasındaki ortalamayı 
 hesaplar.
 * main metodunda bu metodları çağırarak farklı sayılar üzerinde işlemler 
 * yapın ve sonuçları ekrana yazdırın.*/
	public static void main(String[] args) {
		
		// Örnek kullanım
        int max = findMax(5, 10, 3, 8, 15);
        int min = findMin(5, 10, 3, 8, 15);
        double average = calculateAverage(5.0, 10.0, 3.0, 8.0, 15.0);

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        System.out.println("Ortalama: " + average);
	}
	// Girilen sayılar arasındaki en büyük sayıyı bulur
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("En az bir sayı girilmelidir!");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Girilen sayılar arasındaki en küçük sayıyı bulur
    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("En az bir sayı girilmelidir!");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Girilen sayılar arasındaki ortalamayı hesaplar
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("En az bir sayı girilmelidir!");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

}
