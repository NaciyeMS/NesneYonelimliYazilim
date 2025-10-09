package hafta3;

public class D2Switch {

	public static void main(String[] args) {
		/*  a==1 doğru ise yapılacak
			a==2  doğru ise yapılacak
			a yukarıdakileri harici ise yapılacaklar …
			*/
		int a=5;
		if(a==1)	{ System.out.println("bir");}
		else if(a==2){ System.out.println("iki");}
		else 		{ System.out.println("hata");}

		switch(a)
		{
		case 1:		{  System.out.println("bir");  break; }
		case 2:		{  System.out.println("iki");  break; }
		default:	{  System.out.println("hata");  break; }

		}

	}

}
