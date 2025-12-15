package haftaaaaa15Exception;

public class Exception3 {

	public static void main(String[] args) {
		//geçerli bakiye
		checkAccountBalance(-1500);

	}
//Exception yakalandığımızda bunları handle ediliyordu. 
	//burda programın durmasını istiyorum
	private static void checkAccountBalance(int i) {
		if(i<0)
		{
			throw new IllegalArgumentException("hesap bakiyesi negatif olmaz");
		}
		else {
			System.out.println("hesap bakyesi:"+i);
		}
		
	}

}
