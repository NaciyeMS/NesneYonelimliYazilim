package hafta7;

import java.util.concurrent.Flow.Publisher;

public class D2Soru {

	public static void main(String[] args) {
		/*Fonksiyona gönderilen vize final proje notunun ortalamasını
		 *  hesaplayan programı tasarlayınız. 
		 *  Vize %50Final %30  Proje %20 */
		System.out.println("Ortalamanız:"+ortalamaHesapla(85, 84, 33));

	}
	public static double ortalamaHesapla(int v,int f,int o) {
		double ort=(double)v*0.5+(double)f*0.3+(double)o*0.2;
		return ort;
	}
	

}
