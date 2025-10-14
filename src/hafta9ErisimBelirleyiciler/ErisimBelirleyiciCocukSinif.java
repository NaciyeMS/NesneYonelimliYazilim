package hafta9ErisimBelirleyiciler;

public class ErisimBelirleyiciCocukSinif extends ErisimBelirleyiciSinif {
//extends ErisimBelirleyiciSinif İFADESİ
	//extends ErisimBelirleyiciSinif SINIFININ ÇOCUĞU OLDUĞU 
	// YANİ SUBCLASS I OLDUĞUNU BELİRTİR.
	public void subClassFonksiyon() {
		ErisimBelirleyiciSinif e1=new ErisimBelirleyiciSinif();
		System.out.println(e1.publicDegisken); //her yerden ulaşılabilir olduğu için ✓  		
		System.out.println(e1.protectedDegisken);//AYNI PAKET İÇİNDE olduğu için ✓  
		System.out.println(e1.defaultDegisken); //AYNI PAKET İÇİNDE olduğu için  ✓  
		System.out.println(e1.privateDegisken); 
		//AYNI PAKET İÇİNDE olsa BİLE privete içinde bulunduğu sınıf a ait olduğu için ✗  
		//SUBCLASS I olsa BİLE privete içinde bulunduğu sınıf a ait olduğu için ✗  
		
		/*
	  ===========================
	       ACCESS MODIFIERS
	  ===========================

	  Modifier   |  SubClass  | 
	  --------------------------
	  public     |     ✓      | 
	  protected  |     ✓      |  
	  default    |     ✓      |    
	  private    |     ✗      |   
	  --------------------------*/
	}
}
