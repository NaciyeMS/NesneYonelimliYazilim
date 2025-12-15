package haftaaaaa15Exception;

public class Exception1 {
	public static void main(String[] args) {
		int []grades= {85,65,52};
		int divisor=1; //bölen değeri
		int index=1; //index
		calculateAvarage(grades, divisor,index);
	}

	private static void calculateAvarage(int[] grades, int divisor, int index) {
		try {
			int selectedGrade=grades[index]; //ArrayIndexOutOfBoundsException
			int avarage=selectedGrade/divisor; //AritmeticException
			System.out.println(avarage);
			System.out.println(selectedGrade);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("geçersiz indis numarası"+e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println("0 a bölme hatası ");
		}
		catch(Exception e)
		{
			System.out.println("bu dedenin yakaladığı");
		}
		//ArithmeticException<-RuntimeException <-Exception <-Throwable 
		//ArrayIndexOutOfBoundsException<-IndexOutOfBoundsException<-RuntimeException  <-Exception <-Throwable 
	}
}
