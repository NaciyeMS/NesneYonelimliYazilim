package haftaaaaa14_Exception;

public class Exception3 {
public static void main(String[] args) {
	calculateModuls(10,0);
}

private static void calculateModuls(int i, int j) {
	try {
		if(j==0)
			throw new ArithmeticException();
		//bazen hatayı kendimiz throw  ederiz
		
		System.out.println(i/j);
	} catch (ArithmeticException e) {
		System.out.println("catch bölümü çalıştı ");
	}
	
}
}
