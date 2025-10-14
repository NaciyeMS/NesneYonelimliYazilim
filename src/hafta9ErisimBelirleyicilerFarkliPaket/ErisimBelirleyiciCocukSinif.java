package hafta9ErisimBelirleyicilerFarkliPaket;

import hafta9ErisimBelirleyiciler.ErisimBelirleyiciSinif;
//FARKLI PAKETLERDE OLDUKLARI İÇİN 
//YUKARIDAKİ KODU EKLEMEDİKÇE EXTENDS ÇALIŞMAYACAKTI

public class ErisimBelirleyiciCocukSinif extends ErisimBelirleyiciSinif {
//extends ErisimBelirleyiciSinif İFADESİ
	//extends ErisimBelirleyiciSinif SINIFININ ÇOCUĞU OLDUĞU 
	// YANİ SUBCLASS I OLDUĞUNU BELİRTİR.
	public void subClassFonksiyon() {
		ErisimBelirleyiciSinif e1=new ErisimBelirleyiciSinif();
		System.out.println(e1.publicDegisken); //her yerden ulaşılabilir olduğu için ✓  		
		System.out.println(e1.protectedDegisken);//FARKLI PAKET İÇİNDE olduğu için ✗  
		System.out.println(e1.defaultDegisken); //FARKLI PAKET İÇİNDE olduğu için  ✗  
		System.out.println(e1.privateDegisken); 
		//AYNI PAKET İÇİNDE olsa BİLE privete içinde bulunduğu sınıf a ait olduğu için ✗  
		//SUBCLASS I olsa BİLE privete içinde bulunduğu sınıf a ait olduğu için ✗ 
		
		
		/*
		  ===========================
		       ACCESS MODIFIERS
		  ===========================

		  Modifier   |  Global
		  -----------------------
		  public     |    ✓
		  protected  |    ✗
		  default    |    ✗
		  private    |    ✗
		  ----------------------*/
	}
}
