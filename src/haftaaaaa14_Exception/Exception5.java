package haftaaaaa14_Exception;

import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) {
		// StringIndexOutOf BoundsException 
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adınızı girin");
		String userName=klavye.nextLine();
		getChracter(userName, 10);

	}
//n a c i y e
//0 1 2 3 4 5
	private static void getChracter(String userName, int i) {
		try {
			char selectedCharacter=userName.charAt(i);
			System.out.println("Kullanıcı adının 10. indisindeki veri"
			+selectedCharacter
			);
		} catch (StringIndexOutOfBoundsException e) {
			
			System.err.println("10 karakter içeren bir kullanıcı adı belirle");
		System.err.println(e.getMessage());
		}
	}

}
