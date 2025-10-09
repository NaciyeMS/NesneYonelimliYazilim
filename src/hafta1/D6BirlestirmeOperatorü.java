package hafta1;

public class D6BirlestirmeOperatorü {

	public static void main(String[] args) {
		//İki ifadeyi yan yana gelecek şekilde birleştirir.
		System.out.println("bu benim ilk java projem :) ");
	    System.out.print("Merhaba");
	    System.out.print("Java");
	    System.out.println("Dünyası" + "Nasılsın");
	    //Metin yanına sayı gelirse onu da metin ile birleştirir. 
	    System.out.println("Dünyası" + 15);
	    System.out.println(15 + "NACİYE");
	    
	    //İki sayı arasına gelirse artık bir toplama operatörüdür.  
        System.out.println(15 + 20);
        
        //+ nin önünde metin varsa sonraki + lar birleştirme operatörü olur. 
        int a,b;
		a=5;
		b=7;
		System.out.println("10"+a);
		System.out.println("10"+a+b);
		System.out.println(a+b+"10");
		System.out.println(a+"10");

	}

}
