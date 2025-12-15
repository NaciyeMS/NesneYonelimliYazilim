package haftaaaaa14_Exception;

import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen Telefon numaranızı girin");
		String phoneNumber=klavye.nextLine();
		convertPhoneNumberToInt(phoneNumber);
	}

	private static void convertPhoneNumberToInt(String phoneNumber) {
		try {
			int intPhoneNumber=Integer.valueOf(phoneNumber);
			System.out.println("Dönüştürülen değer: "+intPhoneNumber);
			
		} catch (NumberFormatException e) {
			System.out.println("lütfen sadece rakamlardan oluşanbir telefon numarası girin");
			System.out.println(e.getMessage());
		}
		
	}

}
