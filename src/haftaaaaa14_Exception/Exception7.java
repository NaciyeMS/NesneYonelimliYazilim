package haftaaaaa14_Exception;

public class Exception7 {

	public static void main(String[] args) {
		//birden fazla Exception handle Etmek için
		int [] grades= {85,90,78};
		int divisor=0;
		int index=2;
		calculateAvarage(grades,divisor,index);	}
	private static void calculateAvarage(int[] grades, int divisor, int index) {
		try {
			int selectedGrade=grades[index];
			int avarage= selectedGrade/divisor;
			System.out.println("seçilen not"+selectedGrade);
			System.out.println("Ortalama"+avarage);
		} 
		 catch (ArithmeticException e) {
				System.err.println("Bölme işlemi 0 kullanılmaz"+e.getMessage());
			}
		catch (Exception e) {
			System.err.println("Hatalı indek seçildi"+e.getMessage());
		}
	}

}
