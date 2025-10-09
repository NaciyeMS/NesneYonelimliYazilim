package hafta2;

public class D6Scope2 {
	
	public static void main(String[] args) {
		int a=5;//scope alanları dışında tanımlı 
		{
			System.out.println(a);
			//içerdeki scope dan ulaşılır
		}
		System.out.println(a);
		// aynı scope dan da erişilir
		{
			System.out.println(a);
		}

	}

}
