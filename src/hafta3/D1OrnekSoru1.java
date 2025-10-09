package hafta3;

import java.util.Scanner;

public class D1OrnekSoru1 {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		System.out.println("haftanın hangi günündesiniz? ");
		String gun=tara.nextLine();
		if(gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("cumartesi"))
		{
		System.out.println("hafta sonu");
		}
		else {
		System.out.println("hafta içi");
		}


	}

}
