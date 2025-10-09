package hafta3;

import java.util.Scanner;

public class D1OrnekSoru {

	public static void main(String[] args) {
		System.out.println("mail adresinizi girin ");
		Scanner tara=new Scanner(System.in);
		String mail=tara.nextLine();
		System.out.println("sifrenizi girin ");
		String sifre=tara.nextLine();
		String kayitliMail="nmacit@gelisim.edu.tr";
		String kayitliSifre="Nms123*-";
		if(mail.equalsIgnoreCase(kayitliMail)&&sifre.equalsIgnoreCase(kayitliSifre))
		{
		System.out.println("hoşgeldiniz"+mail);
		}
		else {
		System.out.println("mail ya da şifreniz yanlış");
		}

		}


	}


