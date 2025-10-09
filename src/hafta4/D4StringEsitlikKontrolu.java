package hafta4;

public class D4StringEsitlikKontrolu {

	public static void main(String[] args) {
		///İKİ STRING İ KARŞILAŞTIRMAK İÇİN EQUALS KULLANILIR
		        String str1 = new String("merhaba");
		        String str2 = new String("merhaba");
		        String str3 = str1;

		        System.out.println(str1 == str2);      
		        // false → çünkü farklı adresler
		        System.out.println(str1.equals(str2)); 
		        // true  → çünkü içerikleri aynı
		        System.out.println(str1 == str3);     
		        // true  → çünkü aynı adresi gösteriyorlar
		    }
		}
