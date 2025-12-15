package haftaaaaa14_Exception;

public class Exception2 {

	public static void main(String[] args) {
		calculateModuls(10,0);

	}
	private static void calculateModuls(int i, int j) {
		/*Hatanızı try catch ile handle etmek için*/
		try {
			System.out.println(i/j);
			//kontrol işlemiyapılmasını istedğim kod
		} catch (ArithmeticException e) {
			//sistemi durdurmadan 
			//sistemin çalışmasını engellemeden
			System.out.println("hiç bir sayı 0 a bölünmez");
		}
		
		System.out.println("sistem bu kodlardan çalışmaya devamedecekmi?");
		
	}
}
