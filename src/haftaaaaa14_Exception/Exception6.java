package haftaaaaa14_Exception;

import java.util.Scanner;

public class Exception6 {
public static void main(String[] args) {
	//ArrayIndexOutOfBoundsException
	String [] menu= {"Çorba","Salata","Kebap","Tatlı"};
	System.out.println("Rastoran Menüsü: ");
	for (int i=0;i<menu.length;i++) {
		System.out.println((i+1)+"-"+menu[i]);
	}
	System.out.println("Menüden bir ürün seçin");
	Scanner klavye= new Scanner(System.in);
	int selectedItem=klavye.nextInt();
	getMenuItem(menu,selectedItem-1);
}

private static void getMenuItem(String[] menu, int i) {
	try {
		System.out.println("Seçilen yemek"+menu[i]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.err.println("Geçersiz bir seçim işlemi yaptın");
	System.err.println("1-4 arasında seçim yapın");
	}
	
}
}
