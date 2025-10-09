package hafta4;

public class D1StringManipulasyonlar {

	public static void main(String[] args) {
		///STRING MANİPULASYONLARI
		String s="nmacit@gelisim.edu.tr";
		//System.out.println(s.length() );
		//string in uzunluğunu bulan fonksiyon
		
		s="nmacit@gelisim.edu.tr";
		//System.out.println(s.charAt(s.length()-1));
		//string in istenilen indisine ulaşmanızı sağlar
		
		s="nmacit@gelisim.edu.tr";
		String kesilenKisim=s.substring(7,14);
		//System.out.println(kesilenKisim);
		//substring bir string deki belirli bir kısmın alınması nı sağlar
		//ilk indis başlangıç indisi, ikinci sayı bitiş indisi ama dahil değil
		
		s="nmacit@gelisim.edu.tr";
		String kesilenKisim2=s.substring(7);
		//System.out.println(kesilenKisim2);
		//substring 2. kullanım şekli
		//belirlenen indis no dan itibaren sonuna kadar bütün değerleri alır
		
		s="nmacit@gelisim.edu.tr";
		boolean sonuc=s.contains("gelisim.edu.tr");
		//if(sonuc==true)System.out.println("doğru format");
		//else System.out.println("yanlış format ");
		//belirtilen string içerisinde belirtilen veri olup olmadığını kontrol eder
		
		s="nmacit@gelisim.edu.tr";
		boolean sonuc2 =s.startsWith("m");
		//System.out.println(sonuc2);
		//istenilen karakter ile başlıyor mu kontrolü yapmamızı sağlar.
		
		s="nmacit@gelisim.edu.tr";
		int indeksNo=s.indexOf("gelisim");
		//System.out.println(indeksNo);
		/*Bir harfin ya da String değerinin kaçıncı dizinden 
		 * (index) itibaren başladığını merak ediyorsanız, 
		 * indexOf metodunu kullanabilirsiniz. */
		
		
		s="nmacit@gelisim.edu.tr";
	   // if (s.equalsIgnoreCase("NMACİT@gelisim.edu.tr"))	         System.out.println("Aynı değer");
	   // else System.out.println("Farklı değer");
	    /*Bir metni başka bir metinle karşılaştırmak için 
	     * equals ya da equalsIgnoreCase metodlarını kullanabilirsiniz. 
	     * equalsIgnoreCase metodu, karşılaştırılan metni öncelikle küçük 
	     * harflere çevirir ve ardından karşılaştırma yapar. 
	     * Böylelikle büyük-küçük harf durumundan doğacak sorunun
	     *  önüne geçilmiş olur.*/
		
		s="nmacit@gelisim.edu.tr";
		//System.out.println(s.toUpperCase());
		/*Bir metni küçük harflere çevirmek için toLowerCase, 
		 * büyük harflere çevirmek içinse  toUpperCase metodlarını
		 *  kullanabilirsiniz:*/
		
		s="    nmacit@gelisim.edu.tr      ";
		//System.out.println("başladı/"+s.trim()+"/bitti");
		/*Bir metin içerisindeki boşluklardan kurtulmak için
		 *  trim metodu kullanılır. trim metodu, 
		 *  metnin sonunda ve başında yer alan boşlukları yok ederken 
		 *  kelime aralarındaki boşluklara dokunmaz. 
		 *  Bu metod özellikle kullanıcıların formlar ile gönderdiği
		 *   verilerde (isim, e-posta vs.) veritabanına kayıt etmeden
		 *    önce kullanılmalıdır. Böylece olası kullanıcı 
		 *    hataları biraz olsun azaltılabilir ve ileride doğabilecek 
		 *    karşılaştırma hatalarının önüne geçilmiş olur.*/
		
		s="nmacit@gelisim.edu.tr";
		String [] dizi=s.split("@");
		//System.out.println(dizi[0]);
		//System.out.println(dizi[1]);
		/*Bir metni parçalara bölmek için 
		 * (örneğin boşluklara göre ayırıp kelimeleri ayıklama) 
		 * split metodu kullanılır. split metodu regex bir ifade 
		 * içerisindeki kurallara göre String değişkenini böler 
		 * ve bir String dizisi haline getirir.*/
		
		s="nmacit@gelisim.edu.tr";
		//System.out.println(s.replaceAll("gelisim", "gmail"));
		//replace() methodu, 2.parametredekini 1.nin yerine koyar.
		//Küçük büyük harfe duyarladır
		
		s="nmacit@gelisim.edu.tr";
		//System.out.println(s.replace(".", ""));
		//string içerisindeki . ları boşluk ile değiştirdi.
		//Yani sildi
		
		
		s="nmacit@gelisim.edu.tr";
		System.out.println(s.replaceAll("[^a-zA-z]",""));
		//Büyük küçük harfler dışında herşeyi sil
		/*
		   Regex (Regular Expression), metinler üzerinde belirli desenlere uyan kısımları bulmak
		   ya da değiştirmek için kullanılan özel ifadelerdir. Aşağıda sık kullanılan bazı örnekler verilmiştir:

		   1) Rakamlar: [0-9]
		   2) Küçük harfler: [a-z]
		   3) Büyük harfler: [A-Z]
		   4) Hem küçük hem büyük harfler: [a-zA-Z]
		   5) Harfler ve rakamlar: [a-zA-Z0-9]
		   6) Noktalama işaretleri: \\p{Punct}
		   7) Belirli karakterler:
		        - Sesli harfler: [aeiouAEIOU]
		        - Sadece a, x, y: [axy]
		        - A–G ve a–g arasındaki tüm harfler: [A-Ga-g]
		   8) Küçük harfler dışındaki her şey: [^a-z]
		   9) Harfler dışındaki tüm karakterler: [^a-zA-Z]

		   Köşeli parantez kullanılmadığında bazı kısayollar vardır:
		     - Sadece boşluk karakteri: \\s
		     - Boşluk harici her şey: \\S
		     - Sadece rakamlar: \\d   (digit)
		     - Rakam harici her şey: \\D
		*/

	}

}
