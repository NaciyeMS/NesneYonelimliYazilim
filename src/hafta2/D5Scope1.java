package hafta2;

public class D5Scope1 {

	public static void main(String[] args) {
		{
			int a=5;
		}
		
		//System.out.println(a);
		//scope alanı içindeki veriye dışardan erişilemez
		{
			int a=5;
		}
		
		//Farklı scope alanlarındaki değişkenler
		//aynı isimle tanımlansalarda
		//birbirinden farklıdırlar. 
	}

}
