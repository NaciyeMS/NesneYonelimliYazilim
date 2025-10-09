package hafta2;

import java.util.Scanner;

public class D3ScannerSorunu {

	public static void main(String[] args) {
		/*SORUN
		 * Sayısal bir veri aldıktan sonra sözel veriyi 
		 * almadan programı bitiriyor ya da diğer işlemlere geçiyor
			NEDEN? 
		 */
		Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age = input.nextInt(); //Sayisal bir girdi aldim
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Adinizi soyadinizi giriniz");
        String name = input.nextLine();
        /*ÇÖZÜM 1
         * Bu kod, Java'da Scanner sınıfı ile metin tabanlı kullanıcı girişleri alınırken kullanılır.

		 scanner.skip() metodu, verilen desene uyan kısmı girdiden atlamayı sağlar. 
		 Yani, belirtilen kalıba denk gelen bölümü yok sayar. Burada kullanılan desen 
		 "(\r\n|[\n\r\u2028\u2029\u0085])?" şeklindedir ve satır sonu karakterlerini temsil eder.
		
		 Deseni açıklayalım:
		
		 - \r\n : Windows işletim sisteminde satır sonu ifadesi
		 - [\n\r\u2028\u2029\u0085] : Unix/Linux, macOS ve bazı diğer ortamlarda kullanılan 
		   satır sonu karakterlerini belirtir.
		 - ()? : Bu karakter grubunun isteğe bağlı olduğunu gösterir, yani satır sonu 
		   karakteri bulunabilir ya da hiç olmayabilir.*/
        


        System.out.println("Yasinizi giriniz");
        int age12 = input.nextInt(); //Sayisal bir girdi aldim
        Scanner input12 = new Scanner(System.in); 
        // Yeni bir Scanner nesnesi oluşturun
        System.out.println("Adinizi soyadinizi giriniz");
        String name12 = input12.nextLine();        
        /*ÇÖZÜM 2
         * /*İki farklı Scanner nesnesi oluşturarak sorunu çözebilirsiniz. 
         * İlk Scanner nesnesiyle tamsayı değerini alın ve 
         * ikinci Scanner nesnesiyle satırı okuyun.*/
        
        
        
        System.out.println("Çözüm 2 için kodlar");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age2 = input2.nextInt(); //Sayisal bir girdi aldim
        input2.nextLine(); // Dummy nextLine() call
        System.out.println("Adinizi soyadinizi giriniz");
        String name2 = input2.nextLine();        
        /*ÇÖZÜM 3: 
         * Dummy nextLine() ÇağrısınextInt()'ın ardından 
         * bir nextLine() çağrısı yaparak yeni satır karakterini
         *  temizleyebilirsiniz.*/

        
        System.out.println("Çözüm 3 için kodlar");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age3 = Integer.parseInt(input3.nextLine()); 
        // Tüm satırı okuyun ve tamsayıya dönüştürün
        System.out.println("Adinizi soyadinizi giriniz");
        String name3 = input3.nextLine();
        /*ÇÖZÜM 4 Tüm girdiyi nextLine() 
         * ile okuyun ve ardından bu satırı parçalayın.*/

	}

}
