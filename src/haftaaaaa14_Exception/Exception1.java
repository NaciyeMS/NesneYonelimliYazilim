package haftaaaaa14_Exception;

public class Exception1 {

	public static void main(String[] args) {
		calculateModuls(10,0);

	}

	private static void calculateModuls(int i, int j) {
		/*Hatanızı bu şekilde yönetebilirsiniz*/
		if(j==0)
			System.out.println("0 a bölünmez");
		else
		System.out.println(i/j);
		
	}

}
