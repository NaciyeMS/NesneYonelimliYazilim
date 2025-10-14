package hafta8.ders2Constructorlar;

public class EvRunner {

	public static void main(String[] args) {
		       //Tugla d1= new Tugla();
				//default contructor silindiği için hata veriyor
				Tugla t1=new Tugla(8,9,5);
				t1.hacim();
				System.out.println(t1.tuglaYukseklik);
				Tugla t2=new Tugla(5, 4);
				t2.hacim();
				System.out.println(t2.tuglaYukseklik);
				Tugla t3=new Tugla();
				t3.hacim();
				System.out.println(t3.tuglaYukseklik);
				
				//to String metodu kullanımı 
				System.out.println(t3.toString());
	}

}
