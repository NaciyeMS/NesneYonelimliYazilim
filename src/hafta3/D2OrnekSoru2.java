package hafta3;

import java.util.Scanner;

public class D2OrnekSoru2 {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		System.out.println("haftanın hangi günündesiniz? ");
		String gun=tara.nextLine();
		switch (gun.toLowerCase()) {
		case "pazartesi": {System.out.println("1"); break; }
		case "salı": {System.out.println("2"); 		break; }
		case "çarşamba": {System.out.println("3"); 	break; }
		case "perşembe": {System.out.println("4"); 	break; }
		case "cuma": {System.out.println("5"); 		break; }
		case "cumartesi": {System.out.println("6"); break; }
		case "pazar": {System.out.println("7sal"); 	break; }
		default:{System.out.println("hata");		break;}
	    }

	}}
