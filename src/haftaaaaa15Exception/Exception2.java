package haftaaaaa15Exception;

public class Exception2 {

	public static void main(String[] args) {
		//Geçerli bir öğrenci adı
		String studentName1="Ali Veli";
		convertToUpperCase(studentName1);
		//boş bir metin
		String studentName2="";
		convertToUpperCase(studentName2);
		//null bir değişken
		String studentName3=null;
		convertToUpperCase(studentName3);
	}

	private static void convertToUpperCase(String studentName1) {
		try {
			System.out.println("Metnin Büyük harfli hali:" +studentName1.toUpperCase());
			//NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Null bir değişken hatası");
		}
	}

}
