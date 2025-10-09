package hafta1;

public class De12OperatorlerOnceligi {

	public static void main(String[] args) {
		int sonuc=(5+7)*3;		
		System.out.println("(5 + 7) * 3 ="+sonuc);
		int sonuc1=5+7*3;
		System.out.println("5 + 7 * 3 ="+sonuc1);
		int sonuc2 =10 + 3 * 5;
		System.out.println("10 + 3 * 5= "+sonuc2);
		int sonuc3 =10 / 2 * 5;
		System.out.println("10 / 2 * 5= "+sonuc3);
		// * ve / için soldan okumaya başlar
		int sonuc4 =10 - 2 + 5;
		System.out.println("10 - 2 + 5= "+sonuc4);
		// - ve + için soldan okumaya başlar

	}

}
